package com.renker.game;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages={"com.renker.game"})
public class Application {
	
	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		builder.headless(false).run(args);
	}
	
}
