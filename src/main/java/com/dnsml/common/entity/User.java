package com.dnsml.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author wzj
 * @Date 2022/5/15 7:57
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private Integer age;
    private String hobby;
}
