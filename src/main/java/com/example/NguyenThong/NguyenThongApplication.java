package com.example.NguyenThong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class NguyenThongApplication {

	public static void main(String[] args) {
		SpringApplication.run(NguyenThongApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}

}
