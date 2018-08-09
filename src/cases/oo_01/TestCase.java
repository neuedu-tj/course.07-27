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

//        rose.setMarried(true);

        //女朋友 *2

        Person lisa = new Person();
        lisa.setName("lisa");
        Person deanna = new Person();
        deanna.setName("deanna");

        Person[] gfs = {lisa , deanna};

        jack.setGf(gfs);




        if( jack.isIllegality(rose)) {
            jack.setDuixiang(rose);
            rose.setDuixiang(jack);
        } else {
            System.out.println("施主 : 你缘分未到 ...   再忍忍 ...");
        }





    }
}
