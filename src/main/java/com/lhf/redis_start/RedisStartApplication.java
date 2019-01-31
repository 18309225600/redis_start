package com.lhf.redis_start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisStartApplication.class, args);
	}




}

