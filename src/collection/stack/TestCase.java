package collection.stack;

import java.util.Stack;

public class TestCase {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");

        System.out.println("peek : " + s.peek());
        System.out.println("pop : " + s.pop());

        System.out.println(s);

    }

}
