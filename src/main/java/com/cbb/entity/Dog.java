package com.cbb.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @ClassName Dog
 * @Author: ChenBJ
 * @Description: 实体类
 * @Date: 2018/12/3 15:38
 * @Version:
 */
@Data
@ToString
public class Dog {
    private long id;
    private String name;
    private int age;
}
