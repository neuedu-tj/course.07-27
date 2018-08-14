package util.stringBuffer;

public class Test3 {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hello world");


        System.out.println(str.indexOf("s"));

        String[]  skills = {"java","node","webpack","maven","c++","vr","spark"};

        StringBuffer infos = new StringBuffer();
        for (String skill : skills) {
            infos.append(skill).append(",");
        }

        infos.deleteCharAt( infos.lastIndexOf(",") );

        System.out.println(infos.toString());
StringBuilder a = new StringBuilder();
a.append("1");

        System.out.println(infos.reverse());
    }
}
