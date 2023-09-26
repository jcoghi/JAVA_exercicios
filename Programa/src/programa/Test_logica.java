/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author joaof
 */
public class Test_logica {

    public static void main(String[] args) {
        String[] nomes = {"joao", "Miguel", "Pedro", "Matheus", "Ana", "Felipe"};
        for (int cont = 0; cont <= 5; cont++) {
            if (nomes[cont].equals("Pedro")) {
                System.out.println("Encontrei o " + nomes[cont]);
            }
        }
    }
}
