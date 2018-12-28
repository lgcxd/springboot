package com.cbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @ClassName TestController
 * @Author: ChenBJ
 * @Description: 测试jsp的类
 * @Date: 2018/12/3 14:37
 * @Version:
 */
@Controller
@RequestMapping("testJsp")
public class TestController {
    @RequestMapping(value = "test" )
    public String test(Map<String,Object> map){
        map.put("name","xx");
        return "hello";
    }
}
