package loop;

public class TestCase_03 {

    public static void main(String[] args) {

       String[] infos = {"java" , "spark" , "storm" , "kafka" , "mongodb" , "redis" , "elasticSearch"};

//        int i = 0;
//        for (  ; i < infos.length ; ) {
//            System.out.println("element : " + i + " , value : " + infos[i]);
//            i+=2;
//        }
//
//        System.out.println(i);


        for (int j = infos.length -1 ; j >=0  ; j--) {
            System.out.println("element : " + j + " , value : " + infos[j]);
        }


    }



}
