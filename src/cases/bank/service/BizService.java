package cases.bank.service;

import cases.bank.constant.MenusMap;
import cases.bank.dispatcher.BizDispatcher;
import cases.bank.model.menu.ChoiceMenu;
import cases.bank.storage.menu.ChoiceMenuFactory;
import cases.bank.storage.menu.MenuFactory;
import cases.bank.utils.Biz;
import cases.bank.utils.InputFactory;
import cases.bank.utils.TYPE;
import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class BizService {
	
	public void main() {

		/* 主线菜单 */
		MenuFactory factory = new ChoiceMenuFactory( MenusMap.PERSONAL_TITLE, MenusMap.PERSONAL_CHOICES);
		ChoiceMenu choiceMenu = (ChoiceMenu)factory.createMenu();


		System.out.println((MenusMap.getMenus().get(MenusMap.MENU_SYS_TITLE)));
		System.out.println(choiceMenu.toString());

		String result = (String)InputFactory.getInput(TYPE.STRING);

		switch (result) {
			case "1" :
				BizDispatcher.dispatch(Biz.DEPOSITE);
				break;
			case "3" :
				BizDispatcher.dispatch(Biz.TRANSFER);
				break;
			default:
				break;
		}


	}

}
