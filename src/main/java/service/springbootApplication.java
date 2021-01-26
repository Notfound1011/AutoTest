package service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("service.mapper")
@SpringBootApplication
public class springbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(springbootApplication.class, args);
    }
}
