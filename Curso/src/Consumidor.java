import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 12.34, 0.25);
        Produto p2 = new Produto("Caderno", 10.99,0.03);
        Produto p3 = new Produto("Borracha", 6.99,0.18);
        Produto p4 = new Produto("Lapis", 1.99,0.19);
        imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
        produtos.forEach(imprimir);
        produtos.forEach(System.out::println);
    }
}
