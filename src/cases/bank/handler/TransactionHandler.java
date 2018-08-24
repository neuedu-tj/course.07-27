package cases.bank.handler;

import cases.bank.model.Account;
import cases.bank.model.Transaction;
import cases.bank.storage.AccountCache;

public class TransactionHandler {

    public boolean transfer(Transaction transaction) {

        Account from = AccountCache.getInstance().getAccount();

        Account to = AccountCache.getInstance().getAccounts().get(transaction.getCard());

        if(from.getBalance().compareTo(transaction.getAmount())>0) {
            from.setBalance(from.getBalance().subtract(transaction.getAmount()));
            to.setBalance(to.getBalance().add(transaction.getAmount()));
            return true;
        } else {
            return false;
        }
    }
}
