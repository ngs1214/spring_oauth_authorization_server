package com.example.spring_oauth_authorization_server.controller;

import com.example.spring_oauth_authorization_server.dto.RegisterDTO;
import com.example.spring_oauth_authorization_server.entity.RegisterEntity;
import com.example.spring_oauth_authorization_server.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    @ResponseBody
    public RegisterEntity register(RegisterDTO dto) {
        return registerService.register(dto);
    }
}
