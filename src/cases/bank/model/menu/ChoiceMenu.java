package cases.bank.model.menu;

import lombok.Data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Data
public class ChoiceMenu extends Menu {

	private Map<String, String> options = new HashMap<String , String>();

	public ChoiceMenu() {

	}
	
	public ChoiceMenu(String title){
		super(title);
	}
	
	public ChoiceMenu(String title , String end){

		super(title, end);
	}
	
	@Override
	public String toString() {
		StringBuffer sbf = new StringBuffer();
		Collection<String> items = options.values();
		sbf.append(this.getTitle()).append("\n");
		for (String item : items) {
			sbf.append(item).append("\t");
		}
		sbf.append("\n-------- Please Enter !---------");
		return sbf.toString();
	}

	@Override
	public void show() {
		System.out.println(this);
	}


}
