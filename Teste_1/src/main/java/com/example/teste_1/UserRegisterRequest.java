package com.example.teste_1;

public class UserRegisterRequest {

    private static String nome;
    private static String email;
    private static String senha;
    private String confirmSenha;

    public static String getNome() {
        return nome;
    }

    public static String getEmail() {
        return email;
    }

    public static String getSenha() {
        return senha;
    }

    public String getConfirmSenha() {
        return confirmSenha;
    }

}


