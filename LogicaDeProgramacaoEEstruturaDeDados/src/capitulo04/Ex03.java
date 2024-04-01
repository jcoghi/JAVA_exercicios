/*
 * Criar um vetor de 1 posição, Criar um método de adicionar novos elementos
 * a este vetor.
 */
package capitulo04;

/**
 * @author João Felipe F. Coghi
 */
public class Ex03 {

    public static void main(String[] args) {
        int[] v = new int[1];
        v = adicionar(v);
        System.out.println(v.length);

        v = remover(v);
        System.out.println(v.length);
    }

    /**
     *
     * @param vetor: Passar o vetor que será aumentado
     * @return Retorna um novo vetor com todos os elementos do vetor inicial
     * adicionado de mais 1 elemento nulo.
     */
    public static int[] adicionar(int[] vetor) {
        int[] v2 = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++) {
            v2[i] = vetor[i];
        }
        return v2;
    }

    /**
     *
     * @param vetor: Passar o vetor que será reduzido
     * @return Retorna um novo vetor com todos os elementos do vetor inicial
     * subtraído do último elemento.
     */
    public static int[] remover(int[] vetor) {
        int[] v2 = new int[vetor.length - 1];
        for (int i = 0; i < v2.length; i++) {
            v2[i] = vetor[i];
        }
        return v2;
    }
    
    public static int[] ordenarCrescente(int[] vetor) {
        int auxiliar;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < vetor.length; j++) {
                if (vetor[j] > vetor[i]) {
                    auxiliar = vetor[j];
                    
                }
                    
            }
        }
        return vetor;
    }
}
