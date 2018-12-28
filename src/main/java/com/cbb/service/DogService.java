package com.cbb.service;

import com.cbb.entity.Dog;
import com.cbb.mapper.DogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @ClassName DogService
 * @Author: ChenBJ
 * @Description: TODO
 * @Date: 2018/12/3 15:48
 * @Version:
 */
@Service
public class DogService {
    @Autowired
    private DogMapper dogMapper;

    public List<Dog> likeName(String name){
        return dogMapper.likeName(name);
    }

    public Dog getById(long id){
        return dogMapper.getById(id);
    }

    public String getNameById(long id){
        return dogMapper.getNameById(id);
    }

    public void save(Dog dog){
        dogMapper.save(dog);
    }

}
