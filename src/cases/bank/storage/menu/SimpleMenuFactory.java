package cases.bank.storage.menu;


import cases.bank.model.menu.Menu;
import cases.bank.model.menu.SimpleMenu;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SimpleMenuFactory implements MenuFactory {
	
	private String title;
	private String end;
	
	public SimpleMenuFactory(String title) {
		this.title = title;
	}
	
	public SimpleMenuFactory(String title , String end) {
		this.title = title;
		this.end = end;
	}

	@Override
	public Menu createMenu() {
		return new SimpleMenu(this.title , this.end);
	}

}
