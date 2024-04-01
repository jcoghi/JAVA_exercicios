/*
 * Dadas as expressões a seguir, identifique o resultado verdadeiro ou falso 
 * que cada uma delas retornaria, em função dos valores dados.
 */
package capitulo04;

/**
 *
 * @author joaof
 */
public class Ex01 {
    public static void main(String[] args) {
        int a = 3, b = 7;
        System.out.println("a: " + (a == 3 && b == 7));
        System.out.println("b: " + (a < 3 | b != 7));
        System.out.println("c: " + (a <= 3 & b == 7));
        System.out.println("d: " + (a != 2 & b == 7));
        System.out.println("e: " + ((a < 5 & b > 2) || b != 7));
        
    }
}
