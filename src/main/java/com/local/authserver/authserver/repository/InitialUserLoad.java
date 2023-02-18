package com.local.authserver.authserver.repository;

import com.local.authserver.authserver.models.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class InitialUserLoad {

   @Bean
   public ApplicationRunner dataLoad(UserRepository userRepo, PasswordEncoder encoder) {
      return args -> {
         userRepo.save(new User("Tizor", encoder.encode("password"), "ROLE_ADMIN"));
         userRepo.save(new User("Alberto", encoder.encode("password"), "ROLE_ADMIN"));
      };
   }

}
