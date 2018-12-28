package com.cbb.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;

/**
 * @ClassName MybatisConfiguration
 * @Author: ChenBJ
 * @Description: 公共类
 * @Date: 2018/12/3 17:28
 * @Version:
 */
@Configuration
public class MybatisConfiguration {
    @Bean
    public PageHelper pageHelper(){
        System.out.println("MybatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum","true");
        p.setProperty("rowBoundsWithCount","true");
        p.setProperty("reasonable","true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
