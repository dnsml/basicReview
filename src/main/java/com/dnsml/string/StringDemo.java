package com.dnsml.string;

import java.util.Arrays;
import java.util.Locale;


/**
 * @Author wzj
 * @Date 2022/5/18 14:28
 * @Version 1.0
 */
public class StringDemo {

    public static void main(String[] args) {
        String str = "abc.txt";

//        如果包含某字符串，则返回true
        System.out.println("str.contains(\"a\") = " + str.contains("a"));

//        传入正则表达式 对比字符串是否匹配
        System.out.println("str.matches(\"abc.txt\") = " + str.matches("abc.txt"));

//        判断字符串是否以某字符串开头
        System.out.println("str.startsWith(\"abc\") = " + str.startsWith("abc"));

//        判断字符串是否以某字符串结尾
        System.out.println("str.endsWith(\"txt\") = " + str.endsWith("txt"));


//        substring截取开始位置到结束位置的字符串
        String substring = str.substring(str.lastIndexOf(".") + 1);
        System.out.println("substring = " + substring);


//        lastIndexOf()返回最后一个匹配的字符串的索引
        System.out.println("str.lastIndexOf(\".\") = " + str.lastIndexOf("."));
//        indexOf()返回第一个匹配的字符串的索引
        System.out.println("str.indexOf(\".\") = " + str.indexOf("."));


//        split()分割字符串
        String[] split = str.split("\\.");
        System.out.println("split.toString() = " + Arrays.toString(split));


//        trim()去除首尾空格
        System.out.println("str.trim() = " + str.trim());


//        replace()替换字符串
        System.out.println("str.replace(\".\", \"_\") = " + str.replace(".", "_"));


//        toUpperCase()转换为大写
        System.out.println(str.toUpperCase(Locale.ROOT));
//        toLowerCase()转换为小写
        System.out.println(str.toLowerCase(Locale.ROOT));


//        字符串拼接
        System.out.println(str.concat("向末尾拼接"));


//        toCharArray()转换为字符数组
        char[] chars = str.toCharArray();
        System.out.println("chars.toString() = " + Arrays.toString(chars));


//        字符串比较
        System.out.println("str.compareTo(\"abc.txt\") = " + str.compareTo("abc.txt"));

//        charAt()返回指定索引处的字符
        System.out.println("str.charAt(0) = " + str.charAt(0));



//
    }
}
