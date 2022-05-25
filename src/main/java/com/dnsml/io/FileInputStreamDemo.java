package com.dnsml.io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Author wzj
 * @Date 2022/5/18 16:16
 * @Version 1.0
 */
public class FileInputStreamDemo {
    /**
     * 读取文件(字节流)
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("src/main/resources/test.txt");

        try {
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);

            StringBuilder sb = new StringBuilder();
            int b;
            while ((b= reader.read()) != -1){
               sb.append((char)b);
            }
            System.out.println("sb = " + sb);
            reader.close();
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
