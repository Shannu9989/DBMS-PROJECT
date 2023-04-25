package com.dxc.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class hmsSpringRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(hmsSpringRestfulApplication.class, args);
	}		

}
