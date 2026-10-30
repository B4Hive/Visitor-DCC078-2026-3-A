package b4hive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void deveExibirAluno() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Aluno{matricula=1, nome='Ana', curso=Sistemas de Informação}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Professor{matricula=1, nome='Maria', titulacao='Doutorado'}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1, nome='Pedro', salario=5000.0}", visitor.exibir(funcionario));
    }

        @Test
    void deveExibirAlunoJson() {
        Aluno aluno = new Aluno(1, "Ana", new Curso("Sistemas de Informação"));

        PessoaVisitorJSON visitor = new PessoaVisitorJSON();
        assertEquals("{\n    \"matricula\": 1\n    \"nome\": \"Ana\"\n    \"curso\": \"Sistemas de Informação\"\n}", visitor.exibir(aluno));
    }

    @Test
    void deveExibirProfessorJSON() {
        Professor professor = new Professor(1, "Maria", "Doutorado");

        PessoaVisitorJSON visitor = new PessoaVisitorJSON();
        assertEquals("{\n    \"matricula\": 1\n    \"nome\": \"Maria\"\n    \"titulacao\": \"Doutorado\"\n}", visitor.exibir(professor));
    }

    @Test
    void deveExibirFuncionarioJSON() {
        Funcionario funcionario = new Funcionario(1, "Pedro", 5000.0f);

        PessoaVisitorJSON visitor = new PessoaVisitorJSON();
        assertEquals("{\n    \"codigo\": 1\n    \"nome\": \"Pedro\"\n    \"salario\": 5000.0\n}", visitor.exibir(funcionario));
    }
    
}