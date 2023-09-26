package jogo_teste;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Jogo_Teste {
    public static void main(String[] args) {
        String nome;
        int categoria,duracao,cenario;
        
        System.out.println("Insira o nome do personagem");
        Scanner e= new Scanner(System.in);
        nome=e.next();
        System.out.println("escolha as categorias:\n 1-bruxo\n2-arqueiro\n3-paladino");
        categoria=e.nextInt();
        Personagem p1=new Personagem(nome,categoria);
        p1.atacar();
    }
}
