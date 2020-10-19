package com.cos.sequrity_2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable(); // csrf관련 규정 해제
		
		http.authorizeRequests()
		.antMatchers("/admin/**").hasRole("ADMIN") //해당결로는 role이 admin만 가능
		.antMatchers("/**").permitAll();//그외에 모든구간은 모두접근가능
		
	}
	


}
