package com.example.Security.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.Security.Model.User;
import com.example.Security.Repository.RoleCustomRepo;
import com.example.Security.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Service

public class JWTService {
    @Value("${secreate.key}")
    private String secreatekey;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleCustomRepo roleCustomRepo;


    public String generateToken(User user, Collection<SimpleGrantedAuthority> authorities) {
        Algorithm algothim = Algorithm.HMAC256(secreatekey.getBytes(StandardCharsets.UTF_8));
        return JWT.create()
                .withSubject(user.getEmail())
                .withExpiresAt(new Date(System.currentTimeMillis() + 50 * 60 * 1000))
                .withClaim("roles", authorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                .sign(algothim);
    }

    public String generateRefreshToken(User user, Collection<SimpleGrantedAuthority> authorities) {
        Algorithm algothim = Algorithm.HMAC256(secreatekey.getBytes());
        return JWT.create()
                .withSubject(user.getEmail())
                .withExpiresAt(new Date(System.currentTimeMillis() + 70 * 60 * 1000))
                .sign(algothim);
    }
}
