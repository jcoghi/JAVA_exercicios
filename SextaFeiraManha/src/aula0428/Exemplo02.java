/*
 Fazer um jogo de adivinhação de número;
 O jogo vai escolher um número entre 1 e 100 aleatóriamente;
 Salvar este número em uma variável;
 Chamar uma função de verificação;
 Esta função pedirá para o usuário digitar um número e fará a verificação
 se são igual;
 Se não forem iguais, essa função deve chamar-se novamente ;
 Se forem iguais, a função printa na tela o usuário descobriu o número.
 */
package aula0428;

import java.util.Random;
import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {
        Random soraia = new Random();
        int num = soraia.nextInt(100) + 1;
        jogar(num);
    }
    
    public static void jogar(int numeroSecreto){
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int entrada = tc.nextInt();
        
        if (entrada > numeroSecreto) {
            System.out.println("Escolhi um numero menor do que " + entrada);
            jogar(numeroSecreto);
        } else if (entrada < numeroSecreto) {
            System.out.println("Escolhi um numero maior do que " + entrada);
            jogar(numeroSecreto);
        } else{
            System.out.println("Acertou miseravi!");
        }
    }

}
