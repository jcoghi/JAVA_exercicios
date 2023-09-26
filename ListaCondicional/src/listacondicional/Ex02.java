package listacondicional;

public class Ex02 {
    public static void main(String[] args) {
        /* SABENDO QUE a = 3, b = 7 E c = 4, INFORME SE AS EXPRESSÕES ABAIXO
        SÃO VERDADEIRO OU FALSO:*/
        
        int a = 3, b = 7, c = 4;
        System.out.println("(a + c) > b: " + ((a + c) > b));
        System.out.println("b >= (a+2): " + (b >= (a+2)));
        System.out.println("c = (b - a): " + (c == (b - a)));
        System.out.println("(b + a) <= c: " + ((b + a) <= c));
        System.out.println("(c + a) > b: " + ((c + a) > b));    
    }
}
