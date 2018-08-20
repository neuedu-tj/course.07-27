package collection.map;

import java.util.*;

public class TestCase_01 {

    public static void main(String[] args) {

        Map<Integer , Object> maps = new HashMap<>();

        maps.put(1,"tom1");
        maps.put(2,"tom2");
        maps.put(2,"tom3");
        maps.put(3,"tom4");
        maps.put(0,"tom6");

//        System.out.println(maps.get(3));
//        System.out.println(maps.get(2));

        Set<Integer> keys = maps.keySet();
//        System.out.println(keys);
//
//        Iterator<Integer> it  = keys.iterator();
//        while (it.hasNext()) {
//            Integer e = it.next();
//            System.out.println("key : " + e + " : " + maps.get(e));
//        }

//        Set values = maps.entrySet();
//        Iterator va  = values.iterator();
//        while (va.hasNext()) {
//            Object e = va.next();
//            System.out.println("e : " + e );
//        }


        //Entry 接口 ,
            Iterator<Map.Entry<Integer ,Object>> mapIter = maps.entrySet().iterator();
            while(mapIter.hasNext()) {
                Map.Entry<Integer , Object > elements =  mapIter.next();
                System.out.println(elements);
//                elements.getKey()
//                elements.getValue()
            }


    }

}
