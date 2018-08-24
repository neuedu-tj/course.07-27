package cases.bank.main;


import cases.bank.dispatcher.SysDispatcher;
import cases.bank.service.init.AccountInitService;
import cases.bank.utils.Biz;

public class Start {


	public static void main(String[] args) {
		//初始化加载
		AccountInitService accountInitService = new AccountInitService();
		accountInitService.loadAccounts();

		// -- facade

		SysDispatcher.dispatch(Biz.LOGIN);

	}

	
}
