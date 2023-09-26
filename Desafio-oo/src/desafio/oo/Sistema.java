package desafio.oo;

public class Sistema {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao Felipe");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta Azul", 3.5, 10);
        compra1.adicionarItem("Caneta Preta", 3.5, 10);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 20, 1);
        compra2.adicionarItem("Borracha", 5, 10);

        cliente.adicionarCompra(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.getValorTotal());

    }

}
