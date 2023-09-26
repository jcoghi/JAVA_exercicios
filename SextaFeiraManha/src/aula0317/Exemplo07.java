package aula0317;

public class Exemplo07 {
    public static void main(String[] args) {
        int a = 3,
            b = 4,
            c = 7;
        
        System.out.println("(a + c) > b = " + ((a + c) > b)); // 3 + 7 > 4 -> Sim
        System.out.println("b >= (a + 2) = " + (b >= (a + 2))); // 4 >= 3 + 2 -> Não
        System.out.println("c == (b - 2) = " + (c == (b - 2)));//  7 == 4 - 2 -> Não
        System.out.println((b + a) <= c);// 3 + 4 <= 7 -> Sim
        System.out.println((c + a) > b);// 7 + 3 > 4 ->Sim
    }
    
}
