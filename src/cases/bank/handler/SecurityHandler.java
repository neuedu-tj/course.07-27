package cases.bank.handler;

import java.util.Map;

import cases.bank.model.Account;
import cases.bank.storage.AccountCache;

public class SecurityHandler {

	public Account checkAccount(Account account) {

		Map<String, Account> accounts = AccountCache.getInstance().getAccounts();

		if (accounts.containsKey(account.getCard())) {

			Account eq = accounts.get(account.getCard()); //帐号对上了 , 下一步查密码

			if (account.getPwd().equals(eq.getPwd())) {
				return eq;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

}
