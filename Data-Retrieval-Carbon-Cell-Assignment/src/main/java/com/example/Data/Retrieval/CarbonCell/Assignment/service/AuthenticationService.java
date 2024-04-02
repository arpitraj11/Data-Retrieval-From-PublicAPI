package com.example.Data.Retrieval.CarbonCell.Assignment.service;

import com.example.Data.Retrieval.CarbonCell.Assignment.model.AuthenticationResponse;
import com.example.Data.Retrieval.CarbonCell.Assignment.model.User;
import com.example.Data.Retrieval.CarbonCell.Assignment.repository.IUserRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationService {

    @Autowired
    IUserRepo userRepo;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    JwtService jwtService;
    @Autowired
    AuthenticationManager authenticationManager;


    public AuthenticationResponse register(User request) {

        // check if user already exist. if exist than authenticate the user
        if(userRepo.findByEmail(request.getUsername()).isPresent()) {
            return new AuthenticationResponse(null, "User already exist");
        }

        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));


        user.setRole(request.getRole());

        user = userRepo.save(user);

        String jwt = jwtService.generateToken(user);


        return new AuthenticationResponse(jwt, "User registration was successful");

    }

    public AuthenticationResponse authenticate(User request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        User user = userRepo.findByEmail(request.getUsername()).orElseThrow();
        String jwt = jwtService.generateToken(user);


        return new AuthenticationResponse(jwt, "User login was successful");

    }


}
