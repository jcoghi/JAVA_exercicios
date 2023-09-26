package aula0526.poo.relacaoentreclasses;

import java.util.ArrayList;

public class Alunos {
    
    String nome;
    ArrayList<Cursos> cursos = new ArrayList<>();
    
    public Alunos(String nome) {
        this.nome = nome;
    }
    
    public void adicionarCursos(Cursos curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    
}
