package io.byte_stream;

import java.io.*;

import org.apache.commons.lang3.ArrayUtils;

public class Test01_basic {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("src/io/data/io.txt");

		InputStream in = new FileInputStream(file);
		System.out.println(in.available());
//
//		System.out.println(in.read());
//		System.out.println(in.read());
//		System.out.println(in.available());

//		in.skip(1);
//		System.out.println(in.read());


		byte[] datas = new byte[in.available()];
		in.read(datas);

//		String str = new String(datas);
//		System.out.println(str);


		OutputStream out = new FileOutputStream("src/io/data/io-result.txt");

		out.write(datas);

		out.flush();





		
	}

}
