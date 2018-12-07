package com.cbb;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import sun.nio.cs.FastCharsetProvider;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: ChenBJ
 * @Description: 注解@SpringBootApplication指定这是一个Spring boot的应用程序.
 * @Date: 2018/11/29 14:20
 * @Param: @param null
 * @return:
 */
@SpringBootApplication
public class HelloApplication /*extends WebMvcConfigurerAdapter*/{

	/*@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
		super.configureMessageConverters(converters);
		//1. 需要先定义一个convert转换消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		//2.添加fastjson的配置信息,比如:是否要格式化返回json数据;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//3.在conver中添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);
		//4.将convert添加到converters当中
		converters.add(fastConverter);
	}*/

	//解析json第二种方式 使用@Bean注入 fastJsonHttpMessageConverters
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters(){
		//1. 需要先定义一个convert转换消息的对象
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		//2.添加fastjson的配置信息,比如:是否要格式化返回json数据;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//3.在conver中添加配置信息
		fastConverter.setFastJsonConfig(fastJsonConfig);

		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
	/**
 * @Author: ChenBJ
 * @Description: 正在main方法中启动应用程序
 * @Date: 2018/11/29 14:21
 * @Param: @param null
 * @return: 
 */
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
