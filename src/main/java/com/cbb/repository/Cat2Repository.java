package com.cbb.repository;

import com.cbb.bean.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface Cat2Repository extends Repository<Cat,Integer> {
    /**
     * @Author: ChenBJ
     * @Description: 查询方法以get find read开头
     * @Date: 2018/11/30 15:40
     * @Param: @param null
     * @return: 
     */

   // Cat findByCatAge(int id);
    /**
     * @Author: ChenBJ
     * @Description: JPQL yujuhe HQLyujuleisi
     * @Date: 2018/11/30 16:06
     * @Param: @param null
     * @return: 
     */
    @Query("from Cat where catAge=:age")
    Cat findByCatAge(@Param("age") int id);
}
