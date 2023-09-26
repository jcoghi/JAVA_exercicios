/*
    COPIAR TODOS OS ELEMENTOS DE UM VETOR EM ORDEM REVERSA
 */
package listarevisao;

public class Ex15 {
    public static void main(String[] args) {
        
        int v1[] = new int[10];
        int v2[] = new int[v1.length];
        for ( int i = 1; i < 11; i++) {
            v1[i-1] = i;
        }
        
        for (int i = 0; i < v1.length; i++) {
            int temp = v1.length - 1;
            v2[temp - i] = v1[i];
        }
        
        for (int valor: v2) {
            System.out.print(valor + " ");
        }
        System.out.println("");
    }
}
