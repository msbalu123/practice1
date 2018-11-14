package com.practice2.practice2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import top.lshaci.framework.mybatis.MybatisApplication;
import top.lshaci.framework.swagger.SwaggerApplication;

@SpringBootApplication
@Import({MybatisApplication.class, SwaggerApplication.class})
@MapperScan("com.practice2.practice2.mapper")
public class Application {

	public static void main(String[] args)  {
		SpringApplication.run(Application.class, args);
	}

}
