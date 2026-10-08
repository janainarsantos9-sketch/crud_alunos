package br.com.senai.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.teste.model.Aluno;
import br.com.senai.teste.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping 
    public ResponseEntity<Aluno>cadastrar(
            @RequestBody Aluno aluno) {
        Aluno alunoCadastrado = alunoService.cadastrar(aluno);
        return ResponseEntity.status(HttpStatus.CREATED)
        .body(alunoCadastrado);
    }
}

@RestController 
@RequestMapping("/alunos")
public class AlunoController{

private final alunoService alunoservice;

public AlunoController(AlunoService alunoService){
    this.alunoService = alunoService;
}

@PostMapping
public ResponseEntrity<Aluno> cadastrar)
       @ResponseBody Aluno aluno){

        Aluno alunoCadastrado = alunoService.cadastrar(aluno);

        return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(alunoCadastrar);
       }

       @GetMapping
       public ResponseEntity<List<Aluno>> listar() {
         
        List<Aluno> alunos = alunoService.listar();
        return ResponseEntity.ok(alunos);
       
    }

}
