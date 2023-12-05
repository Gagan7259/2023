package com.example.Security2;

import com.example.Security2.Model.Role;
import com.example.Security2.Model.User;
import com.example.Security2.Service.UserService;
import com.example.Security2.Service.UserServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;

@SpringBootApplication
@EnableWebSecurity
@EnableJpaRepositories

public class Security2Application {

    public static void main(String[] args) {
        SpringApplication.run(Security2Application.class, args);
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


   CommandLineRunner run(UserService userService){
        return  args -> {
            userService.saveRole(new Role(null,"ROLE_USER","this is user"));
            userService.saveRole(new Role(null,"ROLE_ADMIN","this is admin"));
            userService.saveRole(new Role(null,"ROLE_MANAGER","this is manager"));


            userService.saveuser(new User("7259173727","Gagan","gagan@gmailcom","pass",new HashSet<>()));
            userService.saveuser(new User("6363541623","Manoj","manoj@gmailcom","word",new HashSet<>()));
            userService.saveuser(new User("6737532826","Sai","sai@gmailcom","sai",new HashSet<>()));



            userService.AddtoUser("gagan@gmailcom","ROLE_USER");
            userService.AddtoUser("manoj@gmailcom","ROLE_ADMIN");
            userService.AddtoUser("Sai@gmailcom","ROLE_MANAGER");


        };
    }
}
