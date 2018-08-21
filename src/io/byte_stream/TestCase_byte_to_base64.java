package io.byte_stream;

import sun.misc.BASE64Encoder;

import java.io.*;

public class TestCase_byte_to_base64 {

    public static void main(String[] args) throws Exception {

        File from = new File("src/io/data/demo-img.jpg");

        InputStream in = new FileInputStream(from);

        byte[] datas = new byte[in.available()];

        in.read(datas);

        String base64 = new String();
        base64.replaceAll(" " , "+");
        BASE64Encoder encoder = new BASE64Encoder();
        base64 = encoder.encode(datas);

        System.out.println(base64);

    }
}
