package cases.bank.storage.menu;

import cases.bank.constant.MenusMap;
import cases.bank.model.menu.ChoiceMenu;
import cases.bank.model.menu.Menu;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ChoiceMenuFactory implements MenuFactory {
	@NonNull private String title;
	@NonNull private String options;


	@Override
	public Menu createMenu() {

		ChoiceMenu menu = new ChoiceMenu(MenusMap.getMenus().get(title));

		String[] menu_str = MenusMap.getMenus().get(options).split(";");

		for (String s : menu_str) {

			menu.getOptions().put(s.substring(0, s.indexOf(".")), s);
		}

		return menu;
	}

}
