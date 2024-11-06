package com.example.authclient.gateways;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/{alunoId}") // Acessado por autenticação básica por usuários que possuam ROLE_ALUNO
    public AlunoResponse getAluno(@PathVariable String alunoId) {
        return AlunoResponse.builder().nome("retornando aluno de id " + alunoId).build();
    }

    @PostMapping // Acessado por autenticação básica por usuários que possuam ROLE_PROFESSOR
    public AlunoResponse createAluno(@RequestBody AlunoRequest alunoRequest) {
        return AlunoResponse.builder().nome(alunoRequest.getNome()).build();
    }

    @PutMapping // Acessado via JWT com autoridade de UPDATE
    public AlunoResponse updateAluno(@RequestBody AlunoRequest alunoRequest) {
        return AlunoResponse.builder().nome(alunoRequest.getNome()).build();
    }
}
