package com.example.daocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@ResponseBody
public class DaocloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaocloudApplication.class, args);
	}

}
