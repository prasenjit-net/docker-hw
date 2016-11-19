package com.example.docker.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerHwApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerHwApplication.class, args);
	}

	@GetMapping("/")
	public String home(){
		return "Hello Docker World!";
	}
}
