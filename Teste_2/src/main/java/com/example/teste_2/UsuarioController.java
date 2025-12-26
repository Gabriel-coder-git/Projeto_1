package com.example.teste_2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// Diz pro Spring:
// "essa classe recebe requisições HTTP"
@RestController
@CrossOrigin(origins = "*") // libera qualquer origem
// Define a rota base
// Tudo aqui começa com /usuarios
@RequestMapping("/usuarios")

public class UsuarioController {

    // ===== ATRIBUTO =====
    // Esse é o service que o controller vai usar
    private final UsuarioService usuarioService;

    // ===== CONSTRUTOR =====
    // O Spring usa isso pra injetar o service
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Lista simulando o "banco"
    private List<Usuario> usuarios = new ArrayList<>();

    // Endpoint de registro (pra já poder salvar usuários)
    @PostMapping("/registrar")
    public String registrarUsuario(@RequestBody Usuario usuario){
        usuarios.add(usuario);
        return "Usuário registrado com sucesso!";
    }

    @GetMapping
    public String teste() {
        return "Controller de usuários funcionando";
    }

    // ===== ENDPOINT =====
    // POST /usuarios/registrar
    @PostMapping("/registrar1")
    public String registrarUsuario1(@RequestBody Usuario usuario) {

        // Chama a lógica
        usuarioService.salvarUsuario(usuario);
        usuarios.add(usuario);
        // Retorno HTTP
        return "Usuário: " + usuario.getNome() + " Email: " + usuario.getEmail() + " registrado com sucesso!";

    }

    @PostMapping("/login")
    public String loginUsuario(@RequestBody Usuario usuario){
        for(Usuario u : usuarios){
            // compara email e senha recebidos
            if(u.getEmail().equals(usuario.getEmail()) && u.getSenha().equals(usuario.getSenha()) && u.getNome().equals(usuario.getNome())){
                return "Login bem-sucedido! Bem-vindo, " + u.getNome();
            }
        }
        return "Usuário ou senha incorretos!";
    }
}

