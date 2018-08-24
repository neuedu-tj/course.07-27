package cases.bank.frame.impl;

import cases.bank.constant.MsgMap;
import cases.bank.frame.InteractiveFrame;
import cases.bank.storage.AccountCache;
import cases.bank.utils.InputFactory;
import cases.bank.utils.TYPE;
import lombok.extern.java.Log;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.logging.Level;

@Log
public class DepositFrame implements InteractiveFrame {

    @Override
    public BigDecimal request() {

        System.out.println("请输入存款数额 : ");

        Double money = (Double)InputFactory.getInput(TYPE.DOUBLE);
        return new BigDecimal(String.valueOf(money));
    }


    @Override
    public void response(Object object) {
        String info = new String(MsgMap.getMsgs().get(MsgMap.DEPOSIT_SUCCESS));
        log.info( MessageFormat.format(info ,  AccountCache.getInstance().getAccount().getBalance().toString()));
    }
}
