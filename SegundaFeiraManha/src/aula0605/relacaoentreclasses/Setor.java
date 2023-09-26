
package aula0605.relacaoentreclasses;

import java.util.ArrayList;
import java.util.List;

public class Setor {
    
    private String nome;
    List<Funcionario> funcionarios = new ArrayList<>();
    
    public Setor(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void addFuncionario(Funcionario funcionario){ 
        this.funcionarios.add(funcionario);
        funcionario.addSetor(this);
    }
    
}
