package com.ably.gd_goods_debug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringKafkaBoilerplate {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaBoilerplate.class, args);
	}

}
