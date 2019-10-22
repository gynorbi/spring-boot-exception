package com.example.springbootexception;

import com.example.springbootexception.exceptions.MyHandlerExceptionResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerExceptionResolver;

@SpringBootApplication
public class SpringBootExceptionApplication {

	@Bean
	HandlerExceptionResolver customExceptionResolver () {
		return new MyHandlerExceptionResolver();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootExceptionApplication.class, args);
	}

}
