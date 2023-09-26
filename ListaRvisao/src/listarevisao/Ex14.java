/*
    PRINTAR TODOS OS ELEMENTOS DE UM ARRAY
*/
package listarevisao;

public class Ex14 {
    public static void main(String[] args) {
        int v1[] = new int[10];
        
        for ( int i = 1; i < 11; i++) {
            v1[i-1] = i;
        }
                
        System.out.print("Vetor: ");
        for (int valor: v1) {
            System.out.print(valor + " ");
        }
        System.out.println("");
    }
            
}
