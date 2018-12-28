package com.cbb.controller;

import com.cbb.entity.Dog;
import com.cbb.service.DogService;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName DogController
 * @Author: ChenBJ
 * @Description: @Api api接口注解
 * @Date: 2018/12/3 15:52
 * @Version:
 */
@Api("狗的相关api")
@RestController
@Slf4j
public class DogController {
    @Autowired
    private DogService dogService;
    /**
     * @Author: ChenBJ
     * @Description:  http://localhost:1117/dog?name=222
     * @Date: 2018/12/3 17:55
     * @Param:  name
     * @return:
     */
    @ApiOperation(value = "根据名字查询信息",notes = "查询某个狗的信息")
    @ApiImplicitParam(name = "name",value = "狗的名字",paramType = "path" ,required = true, dataType = "String")
    @RequestMapping(value = "/dog/{name}", method = RequestMethod.GET)
    public List<Dog> likeName(@PathVariable String name){
        /**
         * 第一个参数第几页 第二个参数 几条数据*/
        //PageHelper.startPage(1,2);
        return dogService.likeName(name);
    }

    @RequestMapping("/save")
    public Dog save(){
        Dog dog = new Dog();
        dog.setName("休息休息");
        dog.setAge(1);
        dogService.save(dog);
        return dog;
    }
}
