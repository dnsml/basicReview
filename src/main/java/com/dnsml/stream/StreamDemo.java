package com.dnsml.stream;

import com.dnsml.common.entity.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author wzj
 * @Date 2022/5/15 7:51
 * @Version 1.0
 */
public class StreamDemo {

    /**
     * //使用stream流进行操作
     * @param args
     */
    public static void main(String[] args) {


        List<User> users = Arrays.asList(
                new User("小刘", 18, "女"),
                new User("小明", 30, "女"),
                new User("小张", 60, "足球"));


//        过滤出年龄大于10并且小于40的用户
        List<User> userList = users.stream().filter(user -> user.getAge() > 10 && user.getAge() < 40).collect(Collectors.toList());

//        截取前n个元素
        users.stream().limit(3).forEach(System.out::println);


//        按照用户年龄从小到大排序
//        reversed() 反转为从大到小
        users.stream().sorted(Comparator.comparing(User::getAge).reversed()).forEach(System.out::println);


//        map转换 Todo
        Set<Integer> userSet= users.stream().map(User::getAge).collect(Collectors.toSet());




    }


}
