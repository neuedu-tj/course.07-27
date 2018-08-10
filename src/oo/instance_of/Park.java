package oo.instance_of;

public class Park {


    public void parking( Auto auto , int time ) {

        if(auto instanceof  Ofo) {
            System.out.println(  "停车费 : " + (time * 0.5) );
        } else if( auto instanceof  Car) {
            System.out.println(  "停车费 : " + (time * 2) );
        } else {

        }

    }


}
