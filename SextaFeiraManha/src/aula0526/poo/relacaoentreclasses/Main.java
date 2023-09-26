package aula0526.poo.relacaoentreclasses;

public class Main {

    public static void main(String[] args) {
        /* 
        Intanciar Cursos e Alunos
        Cadastrar Alunos em algum cursos.
        Cadastrar Crusos em algum aluno.
        */
        
        Cursos java = new Cursos("Java");
        Cursos python = new Cursos("Python");
        Cursos scrum = new Cursos("Scrum");
        
        Alunos joao = new Alunos("Joao");
        Alunos felipe = new Alunos("Felipe");
        
        joao.adicionarCursos(scrum);
        joao.adicionarCursos(java);
        java.adicionarAlunos(felipe);
        
        for(Cursos curso : felipe.cursos){
            System.out.println(curso.nome);
        }
        System.out.println("\n");
        for (Alunos aluno : java.alunos) {
            System.out.println(aluno.nome);
        }
        
    }

}


