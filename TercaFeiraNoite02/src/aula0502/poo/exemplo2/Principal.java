package aula0502.poo.exemplo2;

public class Principal {

    public static void main(String[] args) {
        
        Personagem heroi = new Personagem("Joao",20);
        Personagem monstro = new Personagem("Goblin",2);

        System.out.println(heroi.getNome() + " estava andando" +
        " na floresta quando, de repente....");
        
        System.out.println(monstro.getNome() + " saiu de tras de um "
                + "arbusto.");
        
        System.out.println(heroi.getNome() + " se assusta e corre em "
                + "direcao ao " + monstro.getNome() + " para atacar.");
        
        int ataqueHeroi = heroi.ataque();
        
        System.out.println(heroi.getNome() + " atacou o " + monstro.getNome()
         + " com " + ataqueHeroi);
        
        System.out.println(monstro.getNome() + " tem defesa de " + 
                monstro.getDefesa());
        
        if (monstro.getDefesa() >= ataqueHeroi) {
            System.out.println(monstro.getNome() + " nao sofreu dano"
                    + " e sua vida continua em " + monstro.getVida());
        } else{
            // Causando dano ao monstro:
            int vida = monstro.getVida();
            
            vida -= ataqueHeroi - monstro.getDefesa();
            
            monstro.setVida(vida);
            
            System.out.println(monstro.getNome() + " ficou com "
             + monstro.getVida() + " de vida.");
        }
        
    }

}
