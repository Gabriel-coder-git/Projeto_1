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

        System.out.println("=== CHEGOU NO BACKEND ===");
        System.out.println("Nome: " + UserRegisterRequest.getNome());
        System.out.println("Email: " + UserRegisterRequest.getEmail());
        System.out.println("Senha: " + UserRegisterRequest.getSenha());

        return "Usuário registrado com sucesso";
    }
}

