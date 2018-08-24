package cases.bank.service;

import cases.bank.dispatcher.SysDispatcher;
import cases.bank.frame.impl.DepositFrame;
import cases.bank.model.Account;
import cases.bank.storage.AccountCache;
import cases.bank.utils.Biz;
import lombok.extern.java.Log;

import java.math.BigDecimal;

import java.util.Timer;
import java.util.TimerTask;

@Log
public class DepositService {

    public void deposit() {

        DepositFrame frame = new DepositFrame();
        BigDecimal money = frame.request();

        Account logged = AccountCache.getInstance().getAccount();
        logged.setBalance(logged.getBalance().add(money));

        frame.response(null);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                SysDispatcher.dispatch(Biz.BIZ);
            }
        }, new Long(1000));

    }


}
