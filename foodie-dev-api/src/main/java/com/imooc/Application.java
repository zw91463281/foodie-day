package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author 郭志武
 * @Date 2020/9/30 23:57
 * @Version 1.0
 */
@SpringBootApplication
//添加包扫描
@MapperScan(basePackages = "com.imooc.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
