package com.local.authserver.authserver.web.security;

import com.local.authserver.authserver.models.User;
import com.local.authserver.authserver.repository.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

   @Bean
   SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
      return http.
         authorizeRequests(authorizeRequests -> authorizeRequests.anyRequest().authenticated())
         .formLogin()
         .and().cors().and().csrf().disable()
         .build();
   }

   @Bean
   UserDetailsService userDetailsService(UserRepository userRepo) throws UsernameNotFoundException {
      return username -> {
         User user = userRepo.findByUsername(username);
         if(user != null) return user;
         throw new UsernameNotFoundException("User " + username + " not found.");
      };
   }

   @Bean
   PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
   }

}
