package com.rakuten.rakutenweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.rakuten.rakutenweb"} )
public class RakutenWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(RakutenWebApplication.class, args);
	}

}
