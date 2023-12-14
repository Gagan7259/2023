package com.example.JwtToken.Service.Impl;

import com.example.JwtToken.Repository.UserRepository;
import com.example.JwtToken.Service.UserServioce;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserServioce {
    private final UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsServices() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User Not found"));
            }
        };
    }


}
