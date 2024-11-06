package com.example.authclient.gateways;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {


    @GetMapping("/{alunoId}") // Acessado por autenticacao basica por usuarios que possuam ROLE_ALUNO
    public AlunoResponse getAluno(@PathVariable String alunoId) {
        return AlunoResponse.builder().nome("retornando aluno de id " + alunoId).build();
    }

    @PostMapping// Acessado por autenticacao basica por usuarios que possuam ROLE_PROFESSOR
    public AlunoResponse createAluno(@RequestBody AlunoRequest alunoRequest) {
        return AlunoResponse.builder().nome(alunoRequest.getNome()).build();
    }

    @PutMapping//Acessado via JWT com autoridade de UPDATE
    public AlunoResponse updateAluno(@RequestBody AlunoRequest alunoRequest) {
        return AlunoResponse.builder().nome(alunoRequest.getNome()).build();
    }



}
