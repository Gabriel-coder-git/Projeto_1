package com.example.teste_2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Diz pro Spring:
// "essa classe contém lógica de negócio"
@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    // método para registrar
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // método para login
    public boolean loginUsuario(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail()) && u.getSenha().equals(usuario.getSenha())) {
                return true; // login válido
            }
        }
        return false; // login inválido
    }

    // opcional: retornar o nome do usuário após login
    public String getNomeUsuario(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail()) && u.getSenha().equals(usuario.getSenha())) {
                return u.getNome();
            }
        }
        return null;
    }

    public boolean consultarUsuario(Usuario usuario){

        return false;
    }


}
