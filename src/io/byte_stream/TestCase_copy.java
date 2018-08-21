package io.byte_stream;

import java.io.*;

public class TestCase_copy {
	public static void main(String[] args) throws Exception {


		FileInputStream in = new FileInputStream("src/io/data/maven.jpg");
		FileOutputStream out = new FileOutputStream("src/io/data/maven3.jpg");

		int data = 0;



		while( (data = in.read()) != -1  ) {
			out.write(data);
		}

		out.flush();


	}
}
