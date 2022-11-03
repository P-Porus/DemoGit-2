package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoGit2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoGit2Application.class, args);
	}
	
	@GetMapping("/welcome/{name}")
	public String getName(@PathVariable String name)
	{
		return "Welcome Mr.<h2>"+name;
	}

}
