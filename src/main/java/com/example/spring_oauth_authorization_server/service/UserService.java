package com.example.spring_oauth_authorization_server.service;

import com.example.spring_oauth_authorization_server.dto.UserDTO;
import com.example.spring_oauth_authorization_server.entity.UserEntity;
import com.example.spring_oauth_authorization_server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void join(UserDTO userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
        userEntity.setNickname(userDTO.getNickname());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setRole("ADMIN");

        userRepository.save(userEntity);
    }
}
