package com.wong.upala;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 * @author upala
 */

@SpringBootApplication
@Log4j2
@MapperScan("com.wong.upala.mapper")
public class PositionEngine {

    public static void main(String[] args) {

        log.info("start !!!");
        SpringApplication.run(PositionEngine.class, args);
        log.info("ended !!!");

    }
}
