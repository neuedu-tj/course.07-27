package io.char_stream;

import java.io.*;

public class TestCase {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new InputStreamReader(new FileInputStream("src/io/data/io.txt") );
		Writer writer = new OutputStreamWriter(new FileOutputStream("src/io/data/writer.txt"));
		
		BufferedReader buffer = new BufferedReader(reader);
		BufferedWriter bwriter = new BufferedWriter(writer);
		
		while(buffer.ready()) {
			String line = buffer.readLine();
			bwriter.write(line);
			bwriter.newLine();
			bwriter.newLine();
			bwriter.newLine();
		}

		bwriter.flush();
		
	}

}
