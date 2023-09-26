package jogosegundafeira;

import java.util.Random;

public class Personagem {

    String nome;
    private int energia;
    private int fome;
    private int sono;
    private int comida;
    
    Personagem(String nome) {
        this.nome = nome;
    }
    
    void cacar() {
        if (energia > 2 && (fome < 10 || sono < 10)) {
            energia -= 2;
            fome ++;
            sono ++;
            System.out.print(nome + " cacando... ");
            if (encontrarComida()) {
                System.out.println(" encontrou comida");
                comida++;
            }
            else {
                System.out.println( " nao encontrou comida");
            }
        } else{
            System.out.println(nome + " sem energia para cacar.");
        }
    }
    
    boolean comer() {
        if (fome > 1 && fome <= 9 && comida > 0 && energia > 1) {
            energia --;
            fome = 0;
            sono ++;
            comida--;
            System.out.println(nome + " se alimentou");
            return true;
        }
        else if ((fome > 1 && fome <= 9 && comida == 0 && energia > 1)) {
            System.out.println(nome + " esta com fome, mas nao tem comida.");
        }
        else if (fome >= 10 && comida > 0 && energia > 1) {
            energia = 2;
            fome = 0;
            sono  = 8;
            comida = 0;
            System.out.println(nome + " estava extremamente faminto");
            return true;
        }
        else if (fome >= 10 && comida == 0) {
            System.out.println(nome + " morreu de fome");
            return false;
        }
        else {
            System.out.println(nome + " satisfeito");
        }
        return true;
    }
    
    void dormir(){
        if(sono > 3 && sono <= 9 && fome < 10) {
            energia = 10;
            fome += 2;
            sono = 0;
            System.out.println(nome + " dormiu");
        } else if (sono <= 3){
            System.out.println(nome + " nao esta cansado para dormir.");
        } else if (sono >=10) {
            System.out.println(nome + " desmaiou de cansaco.");
            energia = 6;
            fome = 9;
            sono = 5;
        }
    }
    
    void status() {
        System.out.println("\nEnergia: " + energia);
        System.out.println("Fome: " + fome);
        System.out.println("Sono: " + sono);
        System.out.println("---------------------");
    }
    
    void setClasse(int energia, int fome, int sono) {
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
}
    
    static boolean encontrarComida(){
        Random random = new Random();
        return random.nextBoolean();
    }
    
}
