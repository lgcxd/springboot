package com.cbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @ClassName ThymeleafController
 * @Author: ChenBJ
 * @Description: 1.在thymeleaf模板文件中,标签是需要闭合的,3.0之前是需要闭合的
 * 这里注解用@Controller
 * 支持使用多个模板引擎
 * @Date: 2018/12/3 12:43
 * @Version:
 */
@Controller
@RequestMapping("/templates")
public class ThymeleafController {
    /**
     * @Author: ChenBJ
     * @Description: 映射地址是:/templates/hello
     * @Date: 2018/12/3 12:56
     * @Param: @param null
     * @return: 
     */
   /* @RequestMapping("/hello")
    public ModelAndView hello(){
        *//*return "hello";*//*
        ModelAndView mv = new ModelAndView("hello");
        return mv;
    }*/
    @RequestMapping("/hello")
    public String hello2(Map<String,Object> map){
       map.put("name","andy");
       return "hello";
    }
    /**
     * @Author: ChenBJ
     * @Description:  freemarker
     * @Date: 2018/12/3 13:30
     * @Param: @param null
     * @return: 
     */
    @RequestMapping("/hello1")
    public String hellofree(Map<String,Object> map){
        map.put("name","Deny");
        return "hellof";
    }
}
