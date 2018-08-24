package cases.bank.constant;

import lombok.Data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

@Data
public class MsgMap {

    private static Properties prop = new Properties();
    private static Map<String, String> msgs = new HashMap();

    public static final String LOGIN_SUCCESS = "login.success";

    public static final String TRANSFER_SUCCESS = "transfer.success";
    public static final String DEPOSIT_SUCCESS="deposit.success";

    static {
        try {
            prop.load(MenusMap.class.getResourceAsStream("msg.properties"));

            Iterator it = prop.keySet().iterator();

            while(it.hasNext()) {
                Object key = it.next();
                msgs.put((String)key, prop.getProperty((String)key));

            }

        } catch (Exception e) {
            System.err.println("load msg.properties error");
            e.printStackTrace();
        }
    }

    public static Map<String, String> getMsgs() {
        return msgs;
    }


}
