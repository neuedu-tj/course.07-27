package collection.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TestCase {
	
	public static void main(String[] args) {

		Queue q = new LinkedList();
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		
		System.out.println("looks : " +q.peek() );
		System.out.println("poll  : " + q.poll());

		System.out.println(q);
		
	}

}
