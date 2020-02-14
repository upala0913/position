package com.wong.upala;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/********************************
 *  @program imageEngine
 *  @author upala
 *  @version 0.0.1
 *  @since 2019-11-05 15:59
 *  @description 启动类
 ********************************/

@SpringBootApplication
@Log4j2
@MapperScan("com.wong.upala.mapper")
public class PositionEngine extends SpringBootServletInitializer {

    public static void main(String[] args) {
        log.info("start !!!");
        SpringApplication.run(PositionEngine.class, args);
        log.info("ended !!!");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PositionEngine.class);
    }

}
