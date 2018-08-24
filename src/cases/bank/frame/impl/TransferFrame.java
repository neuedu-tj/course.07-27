package cases.bank.frame.impl;

import cases.bank.constant.MsgMap;
import cases.bank.frame.InteractiveFrame;
import cases.bank.model.Transaction;
import cases.bank.utils.InputFactory;
import cases.bank.utils.TYPE;
import lombok.extern.java.Log;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Date;

@Log
public class TransferFrame implements InteractiveFrame {

    @Override
    public Transaction request() {

        System.out.println("请输入要转账的卡号 : ");
        String card = InputFactory.getInput(TYPE.STRING).toString();
        System.out.println("请输入金额 : ");
        BigDecimal amount = new BigDecimal(InputFactory.getInput(TYPE.DOUBLE).toString());
        System.out.println("请输入转账备注 : ");
        String detail = InputFactory.getInput(TYPE.STRING).toString();

        return new Transaction(card , amount , new Date() , detail);
    }

    @Override
    public void response(Object object) {
        Transaction transaction = (Transaction)object;
        String info = new String(MsgMap.getMsgs().get(MsgMap.TRANSFER_SUCCESS));
        log.info(MessageFormat.format(info , transaction.getTargetName() , transaction.getAmount().toString()) + "\n");

    }
}
