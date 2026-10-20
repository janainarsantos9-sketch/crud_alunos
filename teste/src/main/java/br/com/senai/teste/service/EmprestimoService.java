package br.com.senai.teste.service;

public class EmprestimoService {
    
private final EmprestimoRepository emprestimoRepositry;
private final AlunoRepository alunoRepository;
private final LivroRepository livroRepository;

public EmprestimoService(
        EmprestimoRepository emprestimoRepository;
        AlunoRepository alunoRepository;
        LivroRepository livroRepository) {
    
    this.emprestimoRepository = emprestimoRepository;
    this.alunoRepository = alunoRepository;
    this.livroRepository = livroRepository;
    
        }

public Optional<Emprestimo> cadastrar(
    Integer alunoId, Integer livroId) {

        Optional<Aluno> aluno = alunoRepository.findById(alunoId);
        Optional<Livro> = livroRepository.findById(livroId);

        if (aluno.isEmpty()|| livro.isEmp()) {
            return Optional();

        }

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setAluno(aluno.get());
        emprestimo.setlivro(livro.get());
        emprestimo.setdataEmprestimo(Localdate.now());

        return Optional.of(emprestimoRepository.save(emprestimo));
    }
}
