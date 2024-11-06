package com.example.authclient.gateways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping // Deve ser acessado por todos
    public UsuarioResponse createUser(@RequestBody UsuarioRequest usuarioRequest) {
        String encryptedPassword = passwordEncoder.encode(usuarioRequest.getPassword());
        // Salvar o usuário com a senha criptografada
        return null;
    }

    @GetMapping // Deve ser acessado via autenticação básica por usuário com ROLE_USER
    public String getJwt(Authentication authentication) {
        return "";
    }
}
