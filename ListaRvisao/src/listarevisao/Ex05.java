/*
    PROGRAMA QUE IMPRIME NA TELA TODOS OS NÚEMROS PARES DE 1 A 100
*/















package listarevisao;

public class Ex05 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
