package util.date;

import java.util.Calendar;
import java.util.Date;

public class TestCase_03 {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

//        c.add(Calendar.DAY_OF_MONTH , -40);

//        Date date = c.getTime();
//
//        System.out.println(date);
//
        long time = 1534226436834L;

        Date t2 = new Date(time);

        Date now = new Date();

        System.out.println( t2.before(now));



    }
}
