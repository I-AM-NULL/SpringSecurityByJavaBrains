package com.example.Spring.security.By.JavaBrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EnableOAuth2Sso
public class SpringSecurityByJavaBrainsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityByJavaBrainsApplication.class, args);
	}

}
