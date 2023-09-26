package escola;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        
        Scanner tc = new Scanner(System.in);
        
        Aluno aluno = new Aluno("Joao","11");

        Professor prof = new Professor("João Felipe", 40);
        
        aluno.setNome("Mario");
        aluno.setMatricula(123);
        aluno.setSexo("Masculino");
        
        prof.setNome("Joao Felipe");
        prof.setSalario(3000);
        
        System.out.println("Matricula: " + prof.getMatricula());
        System.out.println("Salario: " + prof.getSalario());
        prof.setSalario(prof.getAumento() + prof.getSalario());
        System.out.println("Salario depois do aumento: " + prof.getSalario());
    }
    
}
