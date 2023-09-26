package jogo_teste;

public class Historia {
    int duracao;
    int cenario;
    Historia(int duracao,int cenario){
        this.duracao=duracao;
        this.cenario=cenario;
        switch(cenario){
            case 1:
                System.out.println("Foresta");
                break;
            case 2:
                System.out.println("Deserto");
                break;
            default:
                System.out.println("Opção incorreta");
        }
    }
}
