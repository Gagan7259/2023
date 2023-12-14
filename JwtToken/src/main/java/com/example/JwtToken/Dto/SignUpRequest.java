package com.example.JwtToken.Dto;

import lombok.Data;

@Data
public class SignUpRequest {
    private String fName;
    private String lName;
    private String email;
    private String password;
}
