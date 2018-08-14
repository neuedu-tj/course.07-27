package util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCase_02 {

    public static void main(String[] args)  throws Exception {

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        String info = sdf.format(date);

        System.out.println(info);

        /////////////////////


        String result = "2018-08-14 02:10:35";

        Date now = sdf.parse(result);

        System.out.println(now);


    }
}
