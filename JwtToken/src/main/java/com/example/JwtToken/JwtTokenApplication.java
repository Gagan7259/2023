package com.example.JwtToken;

import com.example.JwtToken.Model.Role;
import com.example.JwtToken.Model.User;
import com.example.JwtToken.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JwtTokenApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(JwtTokenApplication.class, args);
    }


    public void run(String... args) throws Exception {
        User adminaccount = userRepository.findByRole(Role.ADMIN);

        if (adminaccount == null) {
            User user = new User();
            user.setEmail("admin@gmail.com");
            user.setFname("admin");
            user.setLname("admin");
            user.setRole(Role.ADMIN);
            user.setPassword(new BCryptPasswordEncoder().encode("admin"));
            userRepository.save(user);
        }

    }
}
