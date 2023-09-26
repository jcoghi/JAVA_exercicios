package listacondicional;

public class Ex03 {
    public static void main(String[] args) {
        /* SABENDO QUE a = 5, b = 4,c = 3, d = 6, INFORME SE AS EXPRESSÕES
        ABAIXO SÃO VERDADEIRAS OU FALSAS*/
        
        int a = 5, b = 4, c = 3, d = 6;
        System.out.println("(a > c) AND (c <= d): " + ((a > c) && (c <= d)));
        System.out.println("(a + b) > 10 OR (a + b) == (c + d): " +
                ((a + b) > 10 || (a + b) == (c + d)));
        System.out.println("(a >=c) AND (d >= c): " + ((a >=c) && (d >= c)));
    }
}
