package com.example.authclient.gateways;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping// Deve ser acessado por todos
    public UsuarioResponse createUser(@RequestBody UsuarioRequest usuarioRequest) {
        return null;
    }

    @GetMapping//Deve ser acessado via autenticacao basica por usuario com ROLE_USER
    public String getJwt(Authentication authentication) {
        return "";
    }

}
