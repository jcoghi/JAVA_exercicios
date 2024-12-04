import clientes.Cliente;
import contas.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.nome = "Joao Felipe Coghi";
        joao.cpf = "111.222.333-44";
        joao.endereco = "Rua Casa do Ator, 275";

        Conta primeiraConta = new Conta();
        primeiraConta.deposita(200);
        primeiraConta.saca(-150);
        primeiraConta.titular = joao;


        System.out.println(primeiraConta.titular.nome);
        System.out.println(primeiraConta.titular.cpf);
        System.out.println(primeiraConta.saldo());
        System.out.println(primeiraConta.titular == joao);
        System.out.println("Número da conta: " + primeiraConta.numero);

        Conta felipe = new Conta();
        felipe.titular = new Cliente();

        felipe.titular.nome = "Felipe";
        System.out.println(felipe.titular.nome);
        System.out.println(felipe.saldo());
    }
}