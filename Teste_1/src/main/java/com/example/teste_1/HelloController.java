package com.example.teste_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/Hello")
    public String hello() {
        return "Backend Spring está vivo!";

    }
    @PostMapping("/register")
    public String registerUser(@RequestBody UserRegisterRequest user) {

        System.out.println("=== CHEGOU NO BACKEND ===");
        System.out.println("Nome: " + UserRegisterRequest.getNome());
        System.out.println("Email: " + UserRegisterRequest.getEmail());
        System.out.println("Senha: " + UserRegisterRequest.getSenha());

        return "Usuário registrado com sucesso";
    }
}