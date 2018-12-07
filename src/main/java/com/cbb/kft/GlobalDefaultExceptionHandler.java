package com.cbb.kft;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName GlobalDefaultExceptionHandler
 * @Author: ChenBJ
 * @Description: 1.新建GlobalDefaultExceptionHandler
 * 2.在class添加注解@ControllerAdvice
 * 3.在class添加一个方法
 * 4.在方法上添加 @ExceptionHandler 拦截相应信息的异常
 * 如果返回的是View 方法的返回值是ModelAndView;
 * 6.如果返回的是String或者Json数据,那么需要方法上添加@RequestBody注解
 * @Date: 2018/12/3 11:06
 * @Version:
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String defaultExceptionHandler(HttpServletRequest response,Exception e) {
        return "sorry,service is busy!";
    }
}
