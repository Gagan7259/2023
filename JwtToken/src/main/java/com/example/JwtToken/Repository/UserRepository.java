package com.example.JwtToken.Repository;

import com.example.JwtToken.Model.Role;
import com.example.JwtToken.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
