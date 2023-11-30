package com.example.Security;

import com.example.Security.Model.Role;
import com.example.Security.Model.User;
import com.example.Security.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;

@SpringBootApplication
@EnableWebSecurity
@EnableJpaRepositories
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);

    }

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER", "THIS IS USER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN", "THIS IS ADMIN"));
            userService.saveRole(new Role(null, "ROLE_MANAGER", "THIS IS MANAGER"));


            userService.saveuser(new User("7259173727", "Gagan", "gagankumars7259@gmail.com", "pass", new HashSet<>()));
            userService.saveuser(new User("7259173098", "Gagan28873", "gagankumars@gmail.com", "pass123", new HashSet<>()));
            userService.saveuser(new User("7259173456", "Gagan7656", "gagankumars9@gmail.com", "pass4556", new HashSet<>()));


            userService.addToUser("gagankumars7259@gmail.com", "ROLE_USER");
            userService.addToUser("gagankumars@gmail.com", "ROLE_ADMIN");
            userService.addToUser("gagankumars9@gmail.com", "ROLE_MANAGER");

        };
    }

}
