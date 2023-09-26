/*
    Ainda não tem enunciado
 */
package listarevisao;

/**
 *
 * @author joaof
 */
public class Ex07 {

    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 35;
        b = 3 * b - a;
        switch (b) {
            case 5:
                a = a * b;
                System.out.println(a);
                break;
            case 10:
                a = a + b;
                System.out.println(a);
                break;
            case 15:
                a = 2 * b;
                System.out.println(a);
                break;
            case 25:
                a = b * b;
                System.out.println(a);
                break;
            default:
                System.out.println(a);
        }
    }
}
