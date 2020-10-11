/*
 * package com.jmcp.userregistration.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.core.userdetails.UserDetailsService;
 * import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 * 
 * @Configuration public class AuthConfig {
 * 
 * @Autowired UserDetailsService userDetailsService; // protected void
 * configure(AuthenticationManagerBuilder auth) throws Exception { //
 * auth.userDetailsService(userDetailsService).passwordEncoder(new
 * BCryptPasswordEncoder()); // } protected void configure(HttpSecurity
 * http)throws Exception{
 * http.authorizeRequests().antMatchers("/swagger-ui.html").permitAll().and().
 * csrf().disable(); }
 * 
 * 
 * }
 */