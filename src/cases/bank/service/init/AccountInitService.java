package cases.bank.service.init;

import java.util.Map;


import cases.bank.handler.AccountInitHandler;
import cases.bank.model.Account;
import cases.bank.storage.AccountCache;

/* 加载所有账户信息 */
public class AccountInitService {

	public void loadAccounts() {
		AccountInitHandler handler = new AccountInitHandler();
		Map<String, Account> accounts = handler.loadAccounts();
		AccountCache.getInstance().setAccounts(accounts);
	}

}
