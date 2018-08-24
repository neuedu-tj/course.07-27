package cases.bank.dispatcher;

import cases.bank.service.LoginService;
import cases.bank.service.BizService;
import cases.bank.utils.Biz;

public class SysDispatcher {

	public static void dispatch(String forward) {
		LoginService loginService = new LoginService();
		BizService bizService = new BizService();

		switch (forward) {

			case Biz.LOGIN:
				loginService.login();
				break;

			case Biz.BIZ:
				bizService.main();
				break;

			default:
				break;
		}

	}

}
