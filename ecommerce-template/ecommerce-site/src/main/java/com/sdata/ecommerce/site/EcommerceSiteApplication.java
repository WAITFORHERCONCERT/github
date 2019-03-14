package com.sdata.ecommerce.site;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sdata.ecommerce.site.mapper")
public class EcommerceSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceSiteApplication.class, args);
    }

}

