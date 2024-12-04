public class Programacao {
    public static void main(String[] args) {

        int[] vetor = new int[];
        vetor[0] = 0;
        vetor[1] = 1;
        for (int i = 2; i < vetor.length; i++) {
            vetor[i] = vetor[i-1] * vetor[i-2];
        }

        System.out.println(Arrays.toString(vetor));

    }
}
