package com.fsr.spring.security.config;

import com.fsr.spring.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserService userService;

	@Autowired
	private BasicAuthenticationPoint basicAuthenticationPoint;

	@Autowired
	private HttpLogoutSuccessHandler httpLogoutSuccessHandler;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*
		 * http.csrf().disable().httpBasic().authenticationEntryPoint(
		 * basicAuthenticationPoint)
		 * .and().authorizeRequests().anyRequest().authenticated()
		 * .and().logout().logoutRequestMatcher(new
		 * AntPathRequestMatcher("/logout")).invalidateHttpSession(true).deleteCookies(
		 * "JSESSIONID").logoutSuccessHandler(httpLogoutSuccessHandler)
		 * .and().sessionManagement().maximumSessions(1);
		 */
		
		http.csrf().disable().httpBasic().authenticationEntryPoint(basicAuthenticationPoint)
		.and().authorizeRequests().anyRequest().authenticated()
		.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
		.logoutSuccessHandler(httpLogoutSuccessHandler).invalidateHttpSession(true);

	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(userService);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

}