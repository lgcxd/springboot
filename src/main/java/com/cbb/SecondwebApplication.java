package com.cbb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cbb.*")
public class SecondwebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SecondwebApplication.class, args);
	}
}
