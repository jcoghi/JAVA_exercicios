public class Personagem {
    String nome;
    int vida;
    int ataque;
    int defesa;

    public void Luta(Personagem destino) {
    if (this.ataque > destino.defesa) {
        int dano = this.ataque - destino.defesa;
        destino.vida -=dano;
        System.out.println(this.nome + " atacou com " + this.ataque);
        System.out.println(destino.nome + " defendou com " + destino.defesa);
        System.out.println(this.nome + " conseguiu um dano de " + dano + " e " + destino.nome +
                " ficou com " + destino.vida + " de vida.");
    } else if (ataque <= destino.defesa) {
        System.out.println("***************");
        System.out.println("Você não aplicou dano ao inimigo.");
    }
    }

    public int Fuga(Personagem destino) {
        System.out.println(this.nome + " fugiu...");
        return 0;
    }
}
