package io.ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSer {

	public static void main(String[] args) throws Exception {
		
		Stu stu = new Stu(2,"jack");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/io/data/stu.data"));
		
		out.writeObject(stu);
		
		Stu stu2 = new Stu();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/io/data/stu.data"));
		
		stu2 = (Stu)in.readObject();
		System.out.println(stu2);

	}

}
