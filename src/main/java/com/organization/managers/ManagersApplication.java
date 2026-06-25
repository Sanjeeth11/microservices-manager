package com.organization.managers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ManagersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagersApplication.class, args);
	}

}
