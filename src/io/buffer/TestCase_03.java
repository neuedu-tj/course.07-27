package io.buffer;

import java.io.*;

public class TestCase_03 {
    public static void main(String[] args) throws  Exception {

        InputStream in = new FileInputStream("src/io/data/maven.jpg");
        OutputStream out = new FileOutputStream("src/io/data/maven-out.jpg");

        BufferedInputStream bin = new BufferedInputStream(in);
        BufferedOutputStream bout = new BufferedOutputStream(out);

        long start = System.currentTimeMillis();
        int data = 0;
        while((data = bin.read() )!=-1) {
            bout.write(data);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start );




    }
}
