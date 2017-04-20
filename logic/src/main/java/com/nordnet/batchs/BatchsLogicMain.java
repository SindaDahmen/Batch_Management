package com.nordnet.batchs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)

@Controller

public class BatchsLogicMain extends SpringBootServletInitializer {

	
	public static void main(String[] args) {
		SpringApplication.run(BatchsLogicMain.class, args);
	}
}

