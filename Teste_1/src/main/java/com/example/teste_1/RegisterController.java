package com.example.teste_1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @PostMapping("/register")
    public String register(@RequestBody UserRegisterRequest request) {

        if (!request.getSenha().equals(request.getConfirmSenha())) {
            return "Senhas não conferem";
        }

        return "Usuário registrado com sucesso!";


    }
}

