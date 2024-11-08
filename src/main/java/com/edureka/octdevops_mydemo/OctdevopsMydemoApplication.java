package com.edureka.octdevops_mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OctdevopsMydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OctdevopsMydemoApplication.class, args);
	}

	@GetMapping("/")//from c11 by dev-1 + from d11 by dev-2
    public String hello() {
      return String.format("<h1>Hello There, Welcome to my project<h1>");
    }
	
	//branch demo
	@GetMapping("/welcome")
    public String welcome() {//from e11 + from f11
      return String.format("<h1>Welcome to the world of DevOps!!!<h1>");
    }
}
