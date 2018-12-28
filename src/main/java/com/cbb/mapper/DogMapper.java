package com.cbb.mapper;

import com.cbb.entity.Dog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DogMapper {
    /**
     * @Author: ChenBJ
     * @Description:  #{name}占位符
     * @Date: 2018/12/3 15:46
     * @Param: @param null
     * @return:
     */
    @Select("select * from dog where name=#{name}")
    public List<Dog> likeName(String name);

    @Select("select * from dog where id=#{id}")
    public Dog getById(long id);

    @Select("select name from dog where id= #{id}")
    public String getNameById(long id);

    //保存数据
    @Insert("insert into dog(name,age) values (#{name},#{age})")
    public void save(Dog dog);
}
