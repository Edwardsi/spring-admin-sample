package com.nk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringAdminClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAdminClientApplication.class, args);
	}
}
