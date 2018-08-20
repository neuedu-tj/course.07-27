package extra.commons;



import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections.FastHashMap;
import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

public class Collection_04_MultiMap {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		MultiMap map = new MultiValueMap();
		
		map.put("one", "corejava");  
		map.put("one", "html 5");
		map.put("one", "css3");
		map.put("one", "javascript");
		map.put("one", "Oracle PL/SQL");

		map.put("two", "Http");
		map.put("two", "JavaEE");
		map.put("two", "XML");
		map.put("two", "Ajax");
		map.put("two", "Jquery / ext / dwr ");
		
		
		map.put("three", "spring-boot");
		map.put("three", "hibernate");
		map.put("three", "spring");
		map.put("three", "redis");
		map.put("three", "elasticSearch");
		map.put("three", "Restful API");
		
		Set keySet = map.keySet();   //   one two three
		
		Iterator keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) { 
			Object key = keyIterator.next();
			Collection values = (Collection)map.get(key);
			System.out.println("key: "+key+" , size : "+values.size());
			
			Iterator valuesIterator = values.iterator();
			while(valuesIterator.hasNext()){
				System.out.println("\t value : "+valuesIterator.next());
			}
			
			System.out.println(values);
			
			System.out.println("");
		}

	}
}
