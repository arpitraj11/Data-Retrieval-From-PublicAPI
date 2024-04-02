package com.example.Data.Retrieval.CarbonCell.Assignment.controller;

import com.example.Data.Retrieval.CarbonCell.Assignment.model.AuthenticationResponse;
import com.example.Data.Retrieval.CarbonCell.Assignment.model.User;
import com.example.Data.Retrieval.CarbonCell.Assignment.service.AuthenticationService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.Authenticator;

@RestController
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationController {

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody User request
    ) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody User request) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
