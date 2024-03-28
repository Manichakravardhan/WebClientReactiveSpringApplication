package com.java.serviceregistryeurekha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryEurekhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryEurekhaApplication.class, args);
	}

}
