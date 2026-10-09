package br.com.senai.teste.service;

import org.springframework.stereotype.Service;

import br.com.senai.teste.model.Aluno;
import br.com.senai.teste.repository.AlunoRepository;

@Service 
public  class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    public Aluno cadastrar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}

@Service 
public class AlunoService {

    private final AlunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;

    }
    public Aluno cadastrar(Aluno aluno) {
        return alunoRepository.save(aluno);

    }
    public List<Aluno> listar() {
        return alunoRepository.findAll();
    }
}

@Service
public class alunoService {

    private final AlunoRepository alunoRepository;

    public alunoService(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;

    }
    public aluno cadastrar(Aluno aluno){
        return alunoRepostory.save(aluno);

    }

    public List<Aluno> listar(){
        return alunoRepository.findAll();

    }
    public Optional<Aluno> buscarPorId(Integer id){
        return alunoRepository.findById(id);
    }
}

public class alunoService{
}

public Aluno cadastrar(Aluno aluno){
    return alunoRepository.save(aluno);
}
public List<Aluno>listar(){
    return alunoRepository.finalAll();
}

public Optional<Aluno> buscarPorid(Integer id) {
    return alunorepository.finAllById(id);
}

public Optional<aluno>atualizar(
        Integer id, AlunonovosDados) {.findbyId(id);
    
    Optional<aluno> alunoencontrado = alunoRepository.findById(id);
    

    if(alunoEncontrado.isEmpty()) {
        return optional.empty();
    }

    Aluno aluno = alunoEncontrado.get();

    aluno.setNome(novosdados.getNome();
    aluno.setEmail(novosDados.getEmal();

    return Optional.of(alunoRepository.save(aluno));
}


    
    



