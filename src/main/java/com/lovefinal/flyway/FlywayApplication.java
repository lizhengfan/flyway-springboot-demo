package com.lovefinal.flyway;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FlywayApplication {
	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;

	public static void main(String[] args) {
		SpringApplication.run(FlywayApplication.class, args);
	}
	@RequestMapping("/executeFlyway")
	public void executeFlyway(){
		Flyway flyway = Flyway.configure().dataSource(this.url,this.username,this.password).load();
		flyway.migrate();
	}
}
