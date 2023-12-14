package com.example.JwtToken.Service;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface JwtService {
    String generateToken(UserDetails userDetails);

    Claims extractAllClaims(String token);

    String extractuserName(String token);

    boolean isTokenValid(String token, UserDetails userDetails);

    String generaterefreshToken(Map<String, Object> extraClaims, UserDetails userDetails);
}