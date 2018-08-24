package cases.bank.frame.impl;

import cases.bank.constant.MenusMap;
import cases.bank.constant.MsgMap;
import cases.bank.frame.InteractiveFrame;
import cases.bank.model.Account;
import cases.bank.model.Customer;
import cases.bank.storage.AccountCache;
import cases.bank.utils.InputFactory;
import cases.bank.utils.TYPE;
import lombok.extern.java.Log;

import java.text.MessageFormat;

@Log
public class LoginFrame implements InteractiveFrame {

    @Override
    public Account request() {

        Account temp = new Account();
        System.out.println("请输入用户名 : ");
        temp.setCard(InputFactory.getInput(TYPE.STRING).toString());
        System.out.println("请输入密码 : ");
        temp.setPwd(InputFactory.getInput(TYPE.STRING).toString());

        return temp;
    }

    @Override
    public void response(Object object) {
        if(object!=null) {
            String name = ((Account)object).getCustomer().getName();
            System.out.println((  MessageFormat.format(MsgMap.getMsgs().get(MsgMap.LOGIN_SUCCESS) , name) ));

        }
    }
}
