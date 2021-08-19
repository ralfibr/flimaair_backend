package com.example.flimaair;
/**
 * FlimaAir backend
 * @author Raeef Ibrahim
 * Project internet of things
 * Raeef Ibrahim
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Controller
@SpringBootApplication
public class FlimaairApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlimaairApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer configurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("GET","POST","PUT","DELETE")
						.allowedOrigins("http://localhost:4200");
			}
		};
	}
	}
