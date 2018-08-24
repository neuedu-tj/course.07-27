package cases.bank.service;


import cases.bank.dispatcher.SysDispatcher;
import cases.bank.frame.impl.LoginFrame;
import cases.bank.handler.SecurityHandler;
import cases.bank.model.Account;
import cases.bank.storage.AccountCache;
import cases.bank.utils.Biz;
import lombok.extern.java.Log;

import java.util.logging.Level;

import static java.lang.System.*;

@Log
public class LoginService {
	
	private SecurityHandler securityHandler = new SecurityHandler();
	
	int count = 0; //计数器 3
	
	public void login() {

		LoginFrame frame = new LoginFrame();
		Account temp = frame.request();
		
		temp = securityHandler.checkAccount(temp);
		
		if(temp!=null) {
			AccountCache.getInstance().setAccount(temp);

			frame.response(temp);

			SysDispatcher.dispatch(Biz.BIZ);
			
		}else {
			if(count<2) {
				out.println("第 "+ ++count +" 次登录失败 , 请重新登录");
				login();
			} else {
				log.info("骗子");
				System.exit(0);
			}
		}
	}
	

}
