package com.onlineplatform.proincorruptiblealliance;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.onlineplatform.proincorruptiblealliance.mapper")
@SpringBootApplication
public class ProincorruptibleallianceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProincorruptibleallianceApplication.class, args);
    }

}
