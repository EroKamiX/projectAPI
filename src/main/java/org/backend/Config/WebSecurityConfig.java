package org.backend.Config;

import org.backend.Component.MySimpleUrlAuthenticationSuccesshandler;
import org.backend.Service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@ComponentScan(basePackages = {"org.backend"})
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	 	@Autowired
	    ApplicationConfig applicationConfig;

	    @Autowired
	    MyUserDetailsService myUserDetailsService;

	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(myUserDetailsService).passwordEncoder(passwordEncoder());
	    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

	    public AuthenticationSuccessHandler myAuthenticationSuccesshandler() {
	        return new MySimpleUrlAuthenticationSuccesshandler();
	    }

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.csrf().disable();
	        http.authorizeRequests()
	                .antMatchers("/Admin/**").access("hasRole('ROLE_ADMIN')")
	                .antMatchers("/Teacher/**").access("hasRole('ROLE_TEACHER')")
	                .antMatchers("/Student/**").access("hasRole('ROLE_STUDENT')")
	                .antMatchers("/index").authenticated()
	                .and()
	                .formLogin()
	                .loginPage("/login")
	                .usernameParameter("username")
	                .passwordParameter("password")
	                .successHandler(myAuthenticationSuccesshandler())
	                .failureUrl("/login?error=true").permitAll()
	                .and()
	                .exceptionHandling().accessDeniedPage("/403")
	                .and()
	                .logout();
	    }
}
