
package aula0519.poo.cadastro;

import aula0519.poo.cadastro.funcionarios.Funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("Joao", 41, "Estagiario");
        
        System.out.println(f1.getNome());
        System.out.println(f1.getIdade());

    }
}
