package aula0526.poo.relacaoentreclasses;

import java.util.ArrayList;
import java.util.List;

public class Cursos {
    
    String nome;
    List<Alunos> alunos = new ArrayList<>();
    
    public Cursos(String nome) {
        this.nome = nome;
    }
    
    public void adicionarAlunos(Alunos aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
