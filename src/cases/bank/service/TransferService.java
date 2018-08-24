package cases.bank.service;

import cases.bank.constant.MsgMap;
import cases.bank.dispatcher.SysDispatcher;
import cases.bank.frame.impl.TransferFrame;
import cases.bank.handler.TransactionHandler;
import cases.bank.model.Transaction;

import cases.bank.utils.Biz;
import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class TransferService {

    public void transfer() {

        TransferFrame frame = new TransferFrame();
        Transaction transaction = frame.request();

        TransactionHandler handler = new TransactionHandler();

        if(handler.transfer(transaction)) {
            frame.response(transaction);
        }

        SysDispatcher.dispatch(Biz.BIZ);

    }

    public void saveTransferRecord() {

    }

}
