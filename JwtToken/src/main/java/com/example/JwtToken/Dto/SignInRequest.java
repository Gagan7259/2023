package com.example.JwtToken.Dto;

import lombok.Data;

@Data
public class SignInRequest {

    private String email;
    private String password;
}
