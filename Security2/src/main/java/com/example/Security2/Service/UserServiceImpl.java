package com.example.Security2.Service;

import com.example.Security2.Model.Role;
import com.example.Security2.Model.User;
import com.example.Security2.Repository.RoleRepository1;
import com.example.Security2.Repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository1 roleRepository;

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
    public void AddtoUser(String username, String rolename) {
        if (!userRepository.findByemail(username).isPresent()) {
            throw new IllegalArgumentException("user with email" + username + "does not exits");
        }
        Role role = roleRepository.findByName(rolename);
        if (role == null) {
            throw new IllegalArgumentException("role with name" + rolename + "does not exists");
        }
        User user = userRepository.findByemail(username).get();
        user.getRoles().add(role);
    }
}
