package com.jmcp.userregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MsUserRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsUserRegistrationApplication.class, args);
	}

//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedOrigins("*").allowedMethods(HttpMethod.GET.toString(),
//						HttpMethod.POST.toString(), HttpMethod.PUT.toString(), HttpMethod.DELETE.toString())
//						.maxAge(3600);
//			}
//		};
//	}
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
