package com.services.login.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()

				.withUser("admin").password("venkat").roles("USER")
				.and().withUser("venkat").password("venkat")
				.roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.authorizeRequests().anyRequest().fullyAuthenticated()
				// .antMatchers("**/rest/*")
				.and()
				// .addFilterBefore(customFilter(), BasicAuthenticationFilter.class)
				.httpBasic();
		httpSecurity.csrf().disable();

	}
}
