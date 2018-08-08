package loop;

public class TestCase_04 {

    // break : continue;
    public static void main(String[] args) {

        String[] infos = {"a" , "b" , "c" , "d"};

//        for (int i = 0; i < infos.length; i++) {
//
//            if("b".equals(infos[i])) {
//                break;
//            }
//            System.out.println( infos[i]);
//        }


        for (int i = 0; i < infos.length; i++) {
            if("b".equals(infos[i])) {
                continue;
            }
            System.out.println( infos[i]);
        }
        

    }
}
