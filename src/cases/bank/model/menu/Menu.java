package cases.bank.model.menu;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Menu {

	private String title;
	private String end;

	public Menu(String title) {
		this.title = title;
	}

	public Menu(String title, String end) {
		this.title = title;
		this.end = end;
	}

	abstract void show();

}
