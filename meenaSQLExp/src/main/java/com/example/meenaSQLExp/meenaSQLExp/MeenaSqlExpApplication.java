package com.example.meenaSQLExp.meenaSQLExp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MeenaSqlExpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeenaSqlExpApplication.class, args);
		System.out.println("welcome meena Added GIT and jenkins and all System Time");
	}
	
	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage(
	 * "com.example.meenaSQLExp.meenaSQLExp")).build(); }
	 */
	}
