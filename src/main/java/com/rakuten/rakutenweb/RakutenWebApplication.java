package com.rakuten.rakutenweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
    
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.authorizeRequests()
				.antMatchers("/signup").permitAll()
				.antMatchers("/resources/**","/images/**","/css/**").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/signin").permitAll();
		}

		@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			// TODO Auto-generated method stub
			super.configure(auth);
		}
		
		
	}

}

