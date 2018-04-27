package io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.List;

public class IO {

    public static void main(String[] args) {

//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            while (true) {
//                String line = br.readLine();
//                if(line.equals("quit") || line.equals("exit"))
//                    System.exit(0);
//                System.out.println(line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        String separator = File.pathSeparator;
        File file = new File("C:\\Coding\\Java\\Projects\\Tutorial\\src\\io\\abc.txt");
        System.out.println(file.exists());

        try {
            List<String> lines = Files.readAllLines(Paths.get("C:\\Coding\\Java\\Projects\\Tutorial\\src\\io\\abc.txt"), Charset.defaultCharset());
            for(String str : lines) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("C:\\Coding\\Java\\Projects\\Tutorial\\src\\io\\efg.txt", true);
            writer.write("Hello!");
            writer.write("\r\n");
            writer.write("How are you?");
            writer.write("\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
