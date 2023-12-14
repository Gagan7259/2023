package com.example.JwtToken.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {
    @PostMapping("/admin")
    public ResponseEntity<String> sayHello(){
        return  ResponseEntity.ok("Hey Buddy");
    }
}
