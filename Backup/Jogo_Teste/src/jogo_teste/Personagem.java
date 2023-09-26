package jogo_teste;
import java.util.Random;
import java.util.stream.IntStream;
public class Personagem {
    String nome;
    int vida;
    int categoria;
    int ataque;
    int defesa;
    Personagem(String nome,int categoria){
        this.nome=nome;
        this.categoria=categoria;
        if(this.categoria==1){
            ataque=6;
            defesa=10;
            vida=100;
        }else if(this.categoria==2){
            ataque=16;
            defesa=10;
            vida=100;
        }else if(this.categoria==3){
            ataque=26;
            defesa=10;
            vida=150;
        }else{
            System.out.println("opção inválida");
        }
    }
    public int atacar(){
        System.out.println("Ataque!");
        Random r;
        r = new Random.Random();
        int at;
        at = r*ataque;
        System.out.println("ataque foi "+at);
        return at;
    }
    
}
