package javaapplication27;
import java.util.Scanner;
public class JavaApplication27 {
    public static void main(String[] args) {
     Scanner e=new Scanner(System.in);
     int jogadores,times,c18;
     double malt,alt,peso,idade,midade,p80,t80;
     c18=0;
     malt=0;
     p80=0;
     for(times=1;times<=5;times++){
         midade=0;
         for(jogadores=1;jogadores<=11;jogadores++){
            System.out.println("insira o pesos, altura e idade");
            System.out.println("jogador "+jogadores+" time: "+times);
            peso=e.nextDouble();
            alt=e.nextDouble();
            idade=e.nextDouble();
            if(idade<18){
                c18++;
            }
            midade=midade+idade;
            malt=malt+alt;
            if(peso>80){
                p80++;
            }
         }
         midade=midade/11.0;
         System.out.println("Idade media do time "+times+" foi de "+midade);
     }
     malt=malt/55.0;
        System.out.println("Media de altura do campeonato: "+malt);
        t80=(p80/55.0)*100.0;
        System.out.println("Percentual de jogadores acima de 80Kg: "+t80);
    }
}
