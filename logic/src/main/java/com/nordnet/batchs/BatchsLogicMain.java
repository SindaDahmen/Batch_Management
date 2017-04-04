//package com.nordnet.batchs;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
//public class BatchsLogicMain {
//
//	public static void main(String[] args) {
//		SpringApplication.run(BatchsLogicMain.class, args);
//	}
//	@RestController
//	class GreetingController {
//
//	    @RequestMapping("/hello/{name}")
//	    String hello(@PathVariable String name) {
//	        return "Hello, " + name + "!";
//	    }
//	} 
//}

package com.nordnet.batchs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.ComponentScan;

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

