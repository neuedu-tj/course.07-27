package util.stringBuffer;

public class Test2 {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();

        System.out.println(str.capacity());
        for (int i = 1; i <= 17 ; i++) {
            str.append(i);
        }

        System.out.println(str.capacity());
        for (int i = 1; i <= 16 ; i++) {
            str.append(i);
        }
        System.out.println(str.capacity());

        System.out.println( str.toString() );
    }
}
