
package operadoresBasicos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
//        int n1 = 3;
//        int n2 = 5;
//        float m = (n1 + n2)/2;
//        System.out.println("A média é igual a " + m);
        

/*
* OPERADOR UNÁRIO
* numero++ -> usa o valor e, depois soma 1. -> PRÉ INCREMENTO
* ++numero -> soma 1 antes de utilizar o número. -> PÓS INCREMENTO
*/

//        int numero = 5;
//        int valor =  5 + numero++;
//        System.out.println(valor);
//        System.out.println(numero);

/*
* OPERADOR ATRIBUIÇÃO
* += Somar e atribuir
* -= Subtrair e atribuir
* *= Multiplicar e atribuir
* /= Dividir e atribuir
*/
        int n1 = 6;
        n1 +=2;
        
        int n2 = 6;
        n2 -=2;
        
        int n3 = 6;
        n3 *=2;
        
        int n4 = 6;
        n4 /=2;
        System.out.println( "6 += 2 é " + n1 + "\n" +
                            "6 -= 2 é " + n2 + "\n" +
                            "6 *= 2 é " + n3 + "\n" +
                            "6 /= 2 é " + n4 + "\n");


    }
}
