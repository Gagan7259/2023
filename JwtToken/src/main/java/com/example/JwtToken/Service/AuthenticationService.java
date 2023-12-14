package com.example.JwtToken.Service;

import com.example.JwtToken.Dto.JwtAuthenticationResponse;
import com.example.JwtToken.Dto.RefreshTokenRequest;
import com.example.JwtToken.Dto.SignInRequest;
import com.example.JwtToken.Dto.SignUpRequest;
import com.example.JwtToken.Model.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signIn(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
