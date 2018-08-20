package extra.commons;

import java.util.HashMap;
import java.util.Map;

import extra.commons.support.Person;
import org.apache.commons.beanutils.BeanUtils;


public class Collection_09_MapToBean {

	public static void main(String[] args) throws Exception {
		
		Map<String , Object> params = new HashMap<String , Object>();
		params.put("age", "20");
		params.put("name", "oracle");
		params.put("occupation", "UK");
		
		Person person = new Person();

		BeanUtils.populate(person, params);

		System.out.println(person);

//		System.out.println(Integer.parseInt("20a"));

	}

}
