/*
 * Fazer um programa que gera 2 dados de 6 faces. Os dados devem ser jogados
 * (apresentando seu resultado de maneira aleatória)e, tanto seus resultados,
 * quanto a soma de seus valores devem ser apresentados ao usuário. O usuário 
 * escolhe se joga novamente ou sai do programa
 *      Se a soma dos 2 dados for 2 ou 8 - Jogador ganha;
 *      Se a soma dos 2 dados for 10 - Empate, ninguém ganha;
 *      Se a soma dos 2 dados for 12 - O programa ganha;
 *      Senão - roda os dados novamente automaticamente;
 */
package aula0404;

import java.util.Random;

public class Exemplo03 {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        //int dado1 = aleatorio.nextInt(1, 7); // [1:7[
        int dado2 = 1 + aleatorio.nextInt(6); // [1:7[
        
    }
}
