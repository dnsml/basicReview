package com.dnsml.io;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.nio.cs.ext.GBK;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Author wzj
 * @Date 2022/5/18 16:48
 * @Version 1.0
 */
public class FileOutputStreamDemo {

    /**
     * 边读边写 复制文件(字节流)
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File newFile = new File("src/main/resources/write.txt");
        File oldFile = new File("src/main/resources/test.txt");


        if (!newFile.exists()){
            newFile.getParentFile().mkdirs();
        }

        FileOutputStream os = new FileOutputStream(newFile);
        FileInputStream is = new FileInputStream(oldFile);


        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=is.read(bytes))!=-1){
            os.write(bytes, 0, len);
            os.flush();
        }


        os.close();
        is.close();


    }
}
