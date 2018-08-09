package cases.oo_01;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AbstractDateTimeDV;

public class TestCase {

    public static void main(String[] args) {

        Person jack = new Person();

        jack.setId("120104190001011234");
        jack.setGender(0);
        jack.setName("jack");
        jack.setTel("13712345678");
        jack.setMarried(false);

        Addr a1 = new Addr("300000" , "西七道");
        Addr a2 = new Addr("300100" , "志新公寓1层");
        Addr[] addrs1 = {a1 , a2 };

        jack.setAddr(addrs1);

        ////////////////////////////
        //构造 伴侣

        Person rose = new Person();

        rose.setId("120104190001011234");
        rose.setGender(0);
        rose.setName("rose");
        rose.setTel("13712345678");
        rose.setMarried(false);

        Addr a3 = new Addr("300000" , "西八道");
        Addr a4 = new Addr("300100" , "志新公寓2层");
        Addr[] addrs2 = {a1 , a2 };

        rose.setAddr(addrs2);



        //结婚登记

        jack.setDuixiang(rose);
        rose.setDuixiang(jack);

//        System.out.println( rose.toString() );



        //查看 rose 的  老公 ?

        System.out.println( "rose 的老公 :  " + rose.getDuixiang().getName());
        System.out.println( "rose 的老公 :  " + rose.getDuixiang().getAddr()[1].getDetail());





    }
}
