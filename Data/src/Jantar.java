// Instaciar jantares, pessoas
public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 130);
        Comida arroz = new Comida("Arroz", 0.3);
        Comida feijao = new Comida("Feijão", 0.3);
        Comida carne = new Comida("Carne", 1);

        System.out.println("Peso do " + p1.nome + " é " + p1.peso);
        p1.Comer(arroz);
        p1.Comer(feijao);
        p1.Comer(carne);

        System.out.printf("Agora, depois de comer %s, %s e %s, %s está pesando %.2f", arroz.nome,
                feijao.nome, carne.nome, p1.nome, p1.peso);
    }
}
