package com.example.JwtToken.Service.Impl;

import com.example.JwtToken.Service.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;


@Service
@RequiredArgsConstructor
public class JwtServiceImpl implements JwtService {
    //extract claims
    private <T> T extractClaim(String token, Function<Claims, T> claimsResolvers) {
        final Claims claims = extractAllClaims(token);
        return claimsResolvers.apply(claims);
    }

    //extract all claims

    public Claims extractAllClaims(String token) {
        return Jwts.parserBuilder().setSigningKey(getSinatureKey()).build().parseClaimsJws(token).getBody();
    }

    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String username = extractuserName(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token) {
        return extractClaim(token, Claims::getExpiration).before(new Date());
    }

    @Override
    public String generateToken(UserDetails userDetails) {
        return Jwts.builder().setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
                .signWith(getSinatureKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public String generaterefreshToken(Map<String, Object> extraClaims, UserDetails userDetails) {
        return Jwts.builder().setClaims(extraClaims).setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 604800000))
                .signWith(getSinatureKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    //create method to extract username

    public String extractuserName(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    //create method for signinkey

    private Key getSinatureKey() {
        byte[] key = Decoders.BASE64.decode("JGFDWC7F90WRDVWF09FFF9DW8FWJVFWF89WD89W");
        return Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }


}
