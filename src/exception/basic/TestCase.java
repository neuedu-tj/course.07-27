package exception.basic;

import java.io.File;
import java.util.Date;

public class TestCase {

    public static void main(String[] args) {

        try {

            int[] arr = {1,2,3};

            System.out.println(arr[4]);

            String str = null;

            System.out.println(str.equals("hello"));

        } catch (Exception e ) {

            System.out.println("我是解决错误的全能高手 .... ");
        }

//        catch (NullPointerException e ) {
//            System.out.println("空异常");
//        } catch (ArrayIndexOutOfBoundsException e ) {
//            System.out.println("下标越界");
//        }


    }
}
