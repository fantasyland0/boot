package com.fantasyland.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
@Component
public class App {
	
	@Value("${user.name}")  
    private String name;  
  
    @Value("${user.age}")  
    private Long age;  
    
	@RequestMapping("/")
	public String index() {
		return "Hello Spring Boot, name is " + name + ", age is "+ age;  
	}

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.name"));
		 SpringApplication.run(App.class, args);  
	}
}
