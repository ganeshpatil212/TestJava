package com.myproj.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;

import com.myproj.security.filter.HmacFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	private HmacFilter hmacFilter;
	
	public SecurityConfig(HmacFilter hmacFilter) {
		this.hmacFilter = hmacFilter;
	}

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())// disable CSRF if using HMAC for APIs
            .authorizeHttpRequests(auth -> auth
                    .anyRequest().authenticated())
            .sessionManagement(session -> session
					.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .addFilterBefore(hmacFilter, AnonymousAuthenticationFilter.class);

        return http.build();
    }
//    
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = (UserDetails) UserPass.builder()
//                .username("ganesh")
//                .password("{noop}12345")
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
}
