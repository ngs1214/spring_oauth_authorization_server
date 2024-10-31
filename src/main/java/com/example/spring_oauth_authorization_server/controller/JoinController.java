package com.example.spring_oauth_authorization_server.controller;

import com.example.spring_oauth_authorization_server.dto.UserDTO;
import com.example.spring_oauth_authorization_server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class JoinController {

    private final UserService userService;

    @GetMapping("/join")
    public String joinPage() {
        return "joinPage";
    }

    @PostMapping("join")
    @ResponseBody
    public String join(UserDTO userDTO) {
        userService.join(userDTO);
        return "ok";
    }
}
