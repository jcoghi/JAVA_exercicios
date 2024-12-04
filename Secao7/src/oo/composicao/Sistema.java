package oo.composicao;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nomeCliente;
        String nomeProduto;
        double precoProduto;
        double descontoProduto;
        int quantidadeProduto;
        boolean comprando = true;

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = teclado.nextLine();
        Cliente cliente1 = new Cliente(nomeCliente);

        while (comprando) {
            System.out.print("Vamos adicionar as compras no carrinho...\n");
            System.out.print("Produto: ");
            nomeProduto = teclado.nextLine().toUpperCase();
            System.out.print("Preço: ");
            precoProduto = Double.parseDouble(teclado.nextLine());
            System.out.print("Quantidade: ");
            quantidadeProduto = Integer.parseInt(teclado.nextLine());

            Compra compra1 = new Compra();
            compra1.addItem(nomeProduto, precoProduto, quantidadeProduto);
            cliente1.setCarrinho(compra1);

            System.out.print("Deseja continuar [s/n]: ");
            String opcao = teclado.next().toLowerCase();
            if (opcao.equals("s")) {
                System.out.println(teclado.nextLine());
            } else {
                comprando = false;
            }
        }

        System.out.println("Cliente " + cliente1.nome +
                " comprou R$ " + cliente1.getValorTotal());
        teclado.close();
    }

}
