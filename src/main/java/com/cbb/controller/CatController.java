package com.cbb.controller;
import com.cbb.bean.Cat;
import com.cbb.service.CatService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
/**
 * @ClassName CatController
 * @Author: ChenBJ
 * @Description: TODO
 * @Date: 2018/11/30 14:17
 * @Version:
 */
@RestController
@RequestMapping("/cat")
public class CatController {
    @Resource
    private CatService catService;
    @RequestMapping("/save")
    public String save(){
        Cat cat = new Cat();
        cat.setCatName("xiaohua");
        cat.setCatAge(2);
        catService.save(cat);
        return "ok";
    }

    @RequestMapping("/getAll")
    public Iterable<Cat> getAll(){
        return catService.getAll();
    }

        @RequestMapping("/get")
    public Cat getCat(){
        return catService.getById(4);
    }

    @RequestMapping("/delete")
    public String delete(){
        catService.delete(2);
        return "ok";

    }
    /**
     * @Author: ChenBJ
     * @Description: JDBC的用法
     * http://localhost:8080/cat/jdbcCatName?name=xiao米
     * @Date: 2018/12/3 10:50
     * @Param: @param null
     * @return: 
     */
    @RequestMapping("jdbcCatName")
    public Cat jdbcCatName(String name){
        return catService.getByCatName(name);
    }
}
