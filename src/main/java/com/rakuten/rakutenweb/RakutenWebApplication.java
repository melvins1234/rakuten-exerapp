package com.rakuten.rakutenweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.boot.builder.SpringApplicationBuilder;
=======
>>>>>>> 486cc35a3424647a1da0328772d2f2034127d3d8
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.rakuten.rakutenweb"} )
public class RakutenWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RakutenWebApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RakutenWebApplication.class);
    }

}
