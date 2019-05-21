package com.yidiandian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import utils.SnowflakeIdWorker;

@SpringBootApplication
public class YidiandianBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run( YidiandianBaseApplication.class, args );
    }

    @Bean
    public SnowflakeIdWorker snowflakeIdWorker(){
        return new SnowflakeIdWorker(1, 1);
    }

}
