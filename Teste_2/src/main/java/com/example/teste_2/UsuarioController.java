package com.example.teste_2;

import org.springframework.web.bind.annotation.*;

// Diz pro Spring:
// "essa classe recebe requisições HTTP"
@RestController

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

    @GetMapping
    public String teste() {
        return "Controller de usuários funcionando";
    }

    // ===== ENDPOINT =====
    // POST /usuarios/registrar
    @PostMapping("/registrar")
    public String registrarUsuario(@RequestBody Usuario usuario) {

        // Chama a lógica
        usuarioService.salvarUsuario(usuario);

        // Retorno HTTP
        return "Usuário registrado com sucesso" + usuario.getEmail() + usuario.getNome() ;

    }
}

