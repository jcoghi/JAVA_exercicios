package ordenacao.insercao;

import java.util.Arrays;

/**
 * @author prof. João Felipe F. Coghi
 */
public class Exercicio01 {

    public static void main(String[] args) {

        int v[] = new int[]{5, 3, 9, 8, 7, 6};
        Exercicio01 e1 = new Exercicio01();
        int[] a;
        a = e1.insertion(v, 1);
        System.out.println(Arrays.toString(a));

    }

    /**
     * A função irá sempre percorrer o vetor inteiro em busca de valores
     * fora da ordem; Caso encontre um valor fora da ordem, a função volta ao 
     * início do vetor de refaz a verificação, caso contrário, continua 
     * percorrendo o vetor.
     * @param vetor: inserir o vetor desejado;
     * @param j: Inicialmente colocar 1;
     * @return: Retorna um vetor
     */
    public int[] insertion(int[] vetor, int j) {
        int i = j - 1;
        System.out.println("Entrada: " + Arrays.toString(vetor));
        if (j < vetor.length) {
            if (i >= 0 && vetor[i] > vetor[j]) {
                int chave = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = chave;
                return insertion(vetor, 1);
            } else {
                return insertion(vetor, j + 1);
            }
        }
        return vetor;
    }
}
