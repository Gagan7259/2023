package com.example.JwtToken.Controller;

import com.example.JwtToken.Dto.JwtAuthenticationResponse;
import com.example.JwtToken.Dto.RefreshTokenRequest;
import com.example.JwtToken.Dto.SignInRequest;
import com.example.JwtToken.Dto.SignUpRequest;
import com.example.JwtToken.Model.User;
import com.example.JwtToken.Service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {


    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest) {
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SignInRequest signInRequest) {
        return ResponseEntity.ok(authenticationService.signIn(signInRequest));
    }
    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest ) {
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
}
