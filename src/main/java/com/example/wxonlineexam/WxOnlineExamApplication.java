package com.example.wxonlineexam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.wxonlineexam.mapper")
public class WxOnlineExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxOnlineExamApplication.class, args);
    }

}
