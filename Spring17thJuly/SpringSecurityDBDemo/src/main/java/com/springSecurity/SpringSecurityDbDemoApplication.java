package com.springSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.springSecurity.dao")
public class SpringSecurityDbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDbDemoApplication.class, args);
	}

}
