package com.server.jpserverdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JpServerDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpServerDiscoveryApplication.class, args);
	}

}
