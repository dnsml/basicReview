package com.dnsml.collection;

import com.dnsml.common.entity.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Author wzj
 * @Date 2022/5/22 20:55
 * @Version 1.0
 */
public class CollectionDemo {

    static{
        
    }

    public static void main(String[] args) {
        List<User> userList = Arrays.asList(new User("王志杰", 12, "123"),
                new User("薛宝钗", 16, "贾宝玉"),
                new User("林黛玉", 16, "王母娘娘"));

        Collections.shuffle(userList,new Random(47));

        System.out.println(userList);

    }
}
