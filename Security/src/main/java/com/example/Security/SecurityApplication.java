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
    BCryptPasswordEncoder passwordEncoderr() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER", "this is User"));
            userService.saveRole(new Role(null, "ROLE_ADMIN", "this is User"));

            userService.saveuser(new User("735546", "Gagan", "gagan@gmail.com", "pass", new HashSet<>()));
            userService.saveuser(new User("6483763", "Sai", "sai@gmail.com", "word", new HashSet<>()));

            userService.addToUser("gagan@gmail.com", "ROLE_USER");
            userService.addToUser("sai@gmail.com", "ROLE_ADMIN");

        };
    }

}
