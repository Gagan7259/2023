package com.example.JwtToken.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserServioce {
    UserDetailsService userDetailsServices();
}
