package extra.commons;



import extra.commons.support.Emp;
import extra.commons.support.Person;
import org.apache.commons.beanutils.BeanUtils;


public class Bean_01_CopyProperties {

	public static void main(String[] args) throws Exception {
		
		Person person = new Person();
		person.setAge(10);
		person.setName("tom");
		person.setOccupation("US");
		
		Person person2 = new Person();
		Emp emp = new Emp();
		
		BeanUtils.copyProperties(person2, person); //PropertyUtils.copyProperties(dest, orig)
		BeanUtils.copyProperties(emp, person);
		
		System.out.println(person2);
		System.out.println(emp);

		
		
	}

}
