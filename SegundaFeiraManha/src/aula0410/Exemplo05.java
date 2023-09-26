/*
 * Uma loja tem 5 vendedores: Joao, Felipe, Bertine, Fabiano e Soraia.
 * No mês de desembro, eles tinham a meta de vendas de 1000 unidades.
 * João vendeu 1100, Felipe vendeu 500, Bertine vendou 1500, Fabiano 750 e 
 * Soraia vendeu apenas 50.

 * Faça um programa que verifica se o vendedor bateu a meta de vendas e, retorne:
 *   a) Bonus de 10 % para os vendedores que bateram a meta a partir de 10%
 *   b) Bonus de 5 % para os vendedores que bateram a meta abaixo de 10%
 *   c) Informa os vendedores que não bateram a meta de venda
 */
package aula0410;

public class Exemplo05 {
    public static void main(String[] args) {
        String []vendedores = {"Joao", "Felipe", "Bertine", "Fabiano", "Soraia"};
        int[] vendas = {1100, 500, 1500, 1000, 50};
        int meta = 1000;
        int cont = 0;
        
        for (int venda: vendas) {
            if ( venda >= meta * 1.1) {
                System.out.println(vendedores[cont] + " bateu a meta acima de 10%");
            } else if (venda >= meta) {
                System.out.println(vendedores[cont] + " bateu a meta abaixo de 10%");
            } else {
                System.out.println(vendedores[cont] + " nao bateu a meta");
            }
            cont++;
        }
    }
}
