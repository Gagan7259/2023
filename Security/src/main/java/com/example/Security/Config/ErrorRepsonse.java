package com.example.Security.Config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
public class ErrorRepsonse {
    private HttpStatus statusCode;
    private  String errorMessage;
    private Object body;
    ErrorRepsonse(HttpStatus statusCode, String errorMessage){
        this(statusCode,errorMessage,errorMessage);
    }

    public int getStatusCodeValue(){
        return  statusCode.value();
    }
}
