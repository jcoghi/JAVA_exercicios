package aula0324;

public class Exemplo03 {
    public static void main(String[] args) {
        int a = 2; // 2
        float b = 2f; // 2.0
        double c = 2; // 2.0
        char d = '2';
        String e = "2";
        
        System.out.println("int -> String: " + (String.valueOf(a))); 
        System.out.println("float -> String: " + (String.valueOf(b))); 
        System.out.println("double -> String: " + (String.valueOf(c))); 

        System.out.println("String -> int: " + Integer.parseInt(e));
        System.out.println("String -> float: " + Float.parseFloat(e));
        System.out.println("String -> double: " + Double.parseDouble(e));
        System.out.println("String -> char: " + e.charAt(0));   
    }  
}
