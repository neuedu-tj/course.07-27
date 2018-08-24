package cases.bank.storage;

import java.util.HashMap;
import java.util.Map;

import cases.bank.model.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountCache {

	private static final AccountCache cache = new AccountCache();

	private Map<String , Object> context = new HashMap<String , Object>();

	private Account account; // storage logged customer
	private Map<String, Account> accounts;  // storage all customers

	public static AccountCache getInstance() {
		return cache;
	}



}
