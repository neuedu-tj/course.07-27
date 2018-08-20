package extra.commons;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.iterators.UniqueFilterIterator;

public class Collection_02_UniqueIterator {

	public static void main(String[] args) {
		
		String[] medals = new String[] {"Gold","Silver","Silver","Gold","Bronze"};
		
		List<String> medalsList = Arrays.asList(medals);
		
		Iterator<String> it = medalsList.iterator();
		//唯一
		Iterator<String> uniqueIterator = new UniqueFilterIterator( it );
		
		while(uniqueIterator.hasNext()) {
			System.out.println("Unique Medal: "+uniqueIterator.next());
		}

		Set sets = new HashSet(medalsList);
		System.err.println(sets);
		
	}

}
