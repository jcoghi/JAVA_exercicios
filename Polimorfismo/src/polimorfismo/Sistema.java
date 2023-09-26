package polimorfismo;

public class Sistema {

    public static void main(String[] args) {
        
        Funcionario joao = new Funcionario();
        
        joao.setNome("Joao");
        joao.setSalario(3000);
        joao.setCPF("111.222.333-45");
        
        System.out.println(joao.getBonificacao());
    }  
}
