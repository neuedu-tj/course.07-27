package array;

public class TestCase_06 {

    public static void main(String[] args) {

        char[ ] chs = {'统' , '计','一','个','字','符','在','字','符','串','中'};

        char target = '字';



        for (int i = 0; i < chs.length; i++) {
            if(target == chs[i]) {
                System.out.println(i);
            }
        }

    }
}
