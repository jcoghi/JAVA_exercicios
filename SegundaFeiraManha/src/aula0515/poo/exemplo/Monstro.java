package aula0515.poo.exemplo;

import java.util.Random;

public class Monstro extends Personagem{

    private int defesa;
    
    String[] nomes = {"Slime", "Esqueleto", "Zumbie"};
    Random gerador = new Random();
    
    public Monstro() {
        int i = gerador.nextInt(nomes.length);
        
        if (nomes[i].equals("Slime")) {
            super.setNome(nomes[i]);
            super.setHp(2);
            super.setAtk(1);
            this.defesa = 0;
        } else if (nomes[i].equals("Esqueleto")) {
            super.setNome(nomes[i]);
            super.setHp(5);
            super.setAtk(3);
            this.defesa = 2;
        }else {
            super.setNome(nomes[i]);
            super.setHp(3);
            super.setAtk(2);
            this.defesa = 1;
        }
    }

    public int atacar() {
        if(super.getNome().equals("Slime")) {
            System.out.println("Ataque de meleca");
        } else if(super.getNome().equals("Esqueleto")) {
            System.out.println("Atacou com seu femur");
        } else {
            System.out.println("Mordida");
        }
        return super.getAtk();
    }
    
    public String toString() {
        return "Nome: " + super.getNome() + "\nHP: " + super.getHp() + 
                "\nAtaque: " + super.getHp() + "\nDefesa: " + this.defesa;
    }

}
