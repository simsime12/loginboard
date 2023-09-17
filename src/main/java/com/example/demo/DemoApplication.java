package com.example.demo;

import com.example.demo.controller.TestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
//	@Autowired
//	private static TestController testController;

	public static void main(String[] args) {
//		testController.test();

		SpringApplication.run(DemoApplication.class, args);
	}

}
