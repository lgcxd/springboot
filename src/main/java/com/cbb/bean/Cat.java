package com.cbb.bean;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @ClassName Cat
 * @Author: ChenBJ
 * @Description: 实体类
 * 如何持久化? 1.使用@Entity进行实体类的持久化操作,当jpa检测到我们的实体类
 * 当中有@Entity注解的时候回自动在数据库中生成对应的表结构信息
 * 如何指定主键以及主键的生成策略?
 * @Date: 2018/11/30 13:45
 * @Version:
 */
@Entity
@Data
public class Cat {
    //使用@Id指定主键
    //@GeneratedValue(strategy = GenerationType.AUTO) 指定主键的生产策略,mysql默认是自增长.
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String catName;
    private int catAge;
}
