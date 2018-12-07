package com.cbb.service;

import com.cbb.bean.Cat;
import com.cbb.dao.CatDao;
import com.cbb.repository.Cat2Repository;
import com.cbb.repository.CatRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @ClassName CatService
 * @Author: ChenBJ
 * @Description: TODO
 * @Date: 2018/11/30 14:11
 * @Version:
 */
@Service
public class CatService {
    @Resource
    private CatDao catDao;
    @Resource
    private CatRepository catRepository;
    @Resource
    private Cat2Repository cat2Repository;

    /*save updata delete 方法需要绑定事务
    @Transactional 就是进行事务绑定的注解*/
    /**
     * @Author: ChenBJ
     * @Description: 新增一条数据
     * @Date: 2018/11/30 14:41
     * @Param: @param null
     * @return: 
     */
    @Transactional
    public void save(Cat cat){
      catRepository.save(cat);
    }
    /**
     * @Author: ChenBJ
     * @Description: 删除一条数据
     * @Date: 2018/11/30 14:42
     * @Param: @param null
     * @return: 
     */
    @Transactional
    public void delete(int id){
        catRepository.deleteById(id);

    }
    //查询数据.
    public Iterable<Cat> getAll(){
        return catRepository.findAll();
    }
    //查询数据.
    public Cat getById(int age){
        return cat2Repository.findByCatAge(age);
    }

    public Cat getByCatName(String name){
        return catDao.selectByCatName(name);
    }
}
