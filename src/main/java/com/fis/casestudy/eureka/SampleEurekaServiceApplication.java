package com.fis.casestudy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SampleEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleEurekaServiceApplication.class, args);
	}

}
