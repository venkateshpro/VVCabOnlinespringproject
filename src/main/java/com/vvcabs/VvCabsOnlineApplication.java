package com.vvcabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class VvCabsOnlineApplication {
	
	/**
	*
	* @author Naga Venkatesh
	*/

	public static void main(String[] args) {
		SpringApplication.run(VvCabsOnlineApplication.class, args);
		 /**
	        * This is the main method 
	        * which is very important for 
	        * execution for a Spring Boot Project
	        */
	}

	
}
