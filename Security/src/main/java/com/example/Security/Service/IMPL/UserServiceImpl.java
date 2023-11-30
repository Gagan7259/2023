package com.example.Security.Service.IMPL;

import com.example.Security.Model.Role;
import com.example.Security.Model.User;
import com.example.Security.Repository.RoleRepository;
import com.example.Security.Repository.UserRepository;
import com.example.Security.Service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    private final PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User saveuser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>());
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addToUser(String username, String rolename) {
        if (!userRepository.findByemail(username).isPresent()) {
            throw new IllegalArgumentException("User with Email " + username + "Not Exist");
        }
        Role role=roleRepository.findByName(rolename);
        if (role==null) {
            throw new IllegalArgumentException("Role with Name " + rolename + "Not Exist");
        }

        User user=userRepository.findByemail(username).get();
        user.getRoles().add(role);
    }

}

