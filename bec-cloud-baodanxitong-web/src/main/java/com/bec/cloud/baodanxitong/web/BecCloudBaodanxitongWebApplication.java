package com.bec.cloud.baodanxitong.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages="com.bec")
@EnableSwagger2
@EnableCaching
public class BecCloudBaodanxitongWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BecCloudBaodanxitongWebApplication.class, args);
	}
}
