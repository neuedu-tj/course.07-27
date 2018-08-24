package cases.bank.constant;

import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
public class MenusMap {

	private static Properties prop = new Properties();
	private static Map<String, String> menus = new HashMap<String, String>();

	public static final String MENU_SYS_TITLE = "menu.sys.title";
	public static final String PERSONAL_TITLE = "menu.account.personal.title";
	public static final String PERSONAL_CHOICES = "menu.account.personal.choices";

	static {
		try {
			prop.load(MenusMap.class.getResourceAsStream("menus.properties"));
			Iterator it = prop.keySet().iterator();
			while(it.hasNext()) {
				Object key = it.next();
				menus.put((String)key, prop.getProperty((String)key));
			}
		} catch (Exception e) {
			System.err.println("menus : init menus error . ");
			e.printStackTrace();
		}
	}
	public static Map<String, String> getMenus() {
		return menus;
	}
}
