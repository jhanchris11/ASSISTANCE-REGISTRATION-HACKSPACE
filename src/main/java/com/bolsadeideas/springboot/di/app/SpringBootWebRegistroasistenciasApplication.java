package com.bolsadeideas.springboot.di.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableJdbcHttpSession
public class SpringBootWebRegistroasistenciasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebRegistroasistenciasApplication.class, args);
	}

}
