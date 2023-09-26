/*
 * Vendedores: Joao, Felipe, Miguel, Antonieta
 * Venda do mês: 1000, 1500, 500, 5000
 * Salários: 1000, 1500, 2000, 500
 * Faça um programa que informa se o vendendor vendeu mais do que a meta de
 * 2000 itens. 
 * Caso este vendedor tenha batido a meta, ele receberá uma bonificação de 
 * 10%
 */
package aula0406;

public class Exemplo04 {
    public static void main(String[] args) {
        
        String nomes[] = {"Joao", "Felipe", "Miguel", "Antonieta"}; 
        int vendas[] = {1000, 1500, 500, 5000};
        double salarios[] = {1000, 1500, 2000, 500};
        int meta = 2000;
        
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] > meta) {
                System.out.printf("%s vendeu %d e vai receber R$ %.2f"
                        + "\n",nomes[i], vendas[i], salarios[i]*1,1);
            }
        }      
    }    
}
