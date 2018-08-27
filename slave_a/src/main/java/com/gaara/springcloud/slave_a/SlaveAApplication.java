package com.gaara.springcloud.slave_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SlaveAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlaveAApplication.class, args);
	}
}
