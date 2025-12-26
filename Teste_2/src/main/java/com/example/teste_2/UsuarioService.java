package com.example.teste_2;

import org.springframework.stereotype.Service;

// Diz pro Spring:
// "essa classe contém lógica de negócio"
@Service
public class UsuarioService {

    // Método que recebe um Usuario já pronto
    public void salvarUsuario(Usuario usuario) {

        // Simulação de salvar no banco
        System.out.println("Salvando usuário no backend:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Senha: " + usuario.getSenha());
    }

    public boolean consultarUsuario(Usuario usuario){

        return false;
    }


}
