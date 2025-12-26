package com.example.teste_2;

// Representa o usuário do sistema
public class Usuario {

    // ===== ATRIBUTOS =====
    private String nome;
    private String email;
    private String senha;

    // ===== CONSTRUTOR =====
    // O Spring/Jackson vai usar isso pra criar o objeto
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // ===== GETTERS =====
    // O Spring precisa deles para ler os dados
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}

