package com.cbb.repository;

import com.cbb.bean.Cat;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName CatRepository
 * @Author: ChenBJ
 * @Description: TODO
 * @Date: 2018/11/30 14:03
 * @Version:
 */
public interface CatRepository extends CrudRepository<Cat,Integer>{
}
