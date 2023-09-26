package escola;

import java.util.ArrayList;
import java.util.Random;

public class Professor extends Pessoa {

    private double salario;
    private int matricula;
    private ArrayList<String> cursos = new ArrayList<>();

    public Professor(String nome, int idade) {
        super(nome);
        this.idade = idade;
        this.matricula = matricula();
    }
    
    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<String> cursos) {
        this.cursos = cursos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getAumento() {
        return this.salario * 0.1;
    }

    public int matricula() {
        String matricula = "";
        for (int i = 0; i <= 5; i++) {
            Random numero = new Random();
            int num = numero.nextInt(9);
            matricula += Integer.toString(num);
        }
        return this.matricula = Integer.parseInt(matricula);
    }
}
