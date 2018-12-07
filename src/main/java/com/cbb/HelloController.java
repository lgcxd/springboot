package com.cbb;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName HelloController
 * @Author: ChenBJ
 * @Description: 注解@RestController(等价于@Controller和@RequestBody)
 * @Date: 2018/11/29 14:15
 * @Version:
 */

@RestController
public class HelloController {
    /**
     * @Author: ChenBJ
     * @Description: @RequestMapping建立一个请求映射 http://127.0.0.1:8080/hello
     * @Date: 2018/11/29 14:18
     * @Param: @param null
     * @return:
     */
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        return "hello";
    }

    /**
     * @Author: ChenBJ
     * @Description: Spring Boot 默认使用json解析框架jsckson
     * @Date: 2018/11/29 15:12
     * @Param: @param null
     * @return:
     */
    @RequestMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setId(2);
        user.setName("xxx");
        user.setCreateTime(new Date());
        user.setRemarks("我是备注信息");
        return user;
    }
}
