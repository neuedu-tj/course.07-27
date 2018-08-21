package io.file;

import java.io.File;
import java.util.Date;

        public class TestCase {

            public static void main(String[] args) throws  Exception {

                File file = new File("src/io/data/io.txt");
                File file_02 = new File("src/io/data/io-2.txt");
                File file_new = new File("src/io/data/io.doc");
                File directory = new File("src/io/data");
                File c = new File("c:/");

        System.out.println(directory.isDirectory());
        System.out.println(file.isFile());

        System.out.println("file length : " + file.length());

        System.out.println(c.getFreeSpace());

        file_new.createNewFile();

        System.out.println(file_02.canWrite());

        Date lastModify = new Date(file_02.lastModified());

        System.out.println(lastModify);

        file_02.delete();

//        file.renameTo("")

    }
}
