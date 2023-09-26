package aula0605.relacaoentreclasses;

public class Main {

    public static void main(String[] args) {
        
        Setor ti = new Setor("TI");
        Setor adm = new Setor("Adm");
        Setor jur = new Setor("Juridico");
        Setor manuntecao = new Setor("Manutenção");
        
        Funcionario joao = new Funcionario("Joao");
        Funcionario felipe = new Funcionario("Felipe");
        Funcionario paloma = new Funcionario("Paloma");
        Funcionario breno = new Funcionario("Breno");
        

        ti.addFuncionario(joao);
        ti.addFuncionario(felipe);
        ti.addFuncionario(paloma);
        ti.addFuncionario(breno);
        
        System.out.println("Pessoas do setor de TI");
        for (Funcionario f: ti.funcionarios) {
            System.out.println(f.getNome());
        }
        
        System.out.println("Setores da Joao");
        for (Setor s: joao.setores) {
            System.out.println(s.getNome());
        }
      
    }
}
