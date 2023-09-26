package aula0519.poo.enums.rpg;

public class Main {
    
    
    public static void main(String[] args) {
        
        Monstro[] m = new Monstro[3];
        int i = 0;
        
        for (Monstro.Monstros db : Monstro.Monstros.values()) {
            m[i] = new Monstro(db);
            i++;
        }
        for (Monstro m1: m) {
            System.out.println(m1.toString());
        }
    }
    
}
