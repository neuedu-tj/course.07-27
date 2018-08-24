package cases.bank.handler;

import cases.bank.model.Account;
import cases.bank.model.Customer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class AccountInitHandler {

	private Map<String, Account> accounts;

	public AccountInitHandler() { //构造函数   目前负责 装配所有的账户
		
		Customer c1 = new Customer("A");
		Customer c2 = new Customer("B");

		Account a1 = new Account();
		a1.setCard("1001");
		a1.setPwd("123");
		a1.setCustomer(c1);
		a1.setBalance(new BigDecimal("2300.2"));

		Account a2 = new Account();
		a2.setCard("1002");
		a2.setPwd("123");
		a2.setCustomer(c2);
		a2.setBalance(new BigDecimal("300.0"));
		
		
		accounts = new HashMap();
		
		accounts.put(a1.getCard(), a1);
		accounts.put(a2.getCard(), a2);
		

	}

	public Map<String, Account> loadAccounts() {
		
		//txt  xls
		return accounts;
	}

}
