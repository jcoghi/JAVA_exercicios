
package provaexercicio1;

public class ProvaExercicio1 {

    public static void main(String[] args) {
        
        int vet[] = { 2, 3, 4, 5, 6, 7, 8, 2 };

        int firstMat[][] = new int[2][2];

        int SecondMat[][] = new int[2][2];

        System.out.println("Primeira Matriz: ");
       

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                for (int i = 0; i < 4; i++) {
                    
                    firstMat[0][0] = vet[0];
                    firstMat[0][1] = vet[1];
                    firstMat[1][0] = vet[2];
                    firstMat[1][1] = vet[3];
                }
                System.out.println("Linha: " + (linha + 1) +
                        " Coluna: " + (coluna + 1) + ": "
                        + firstMat[linha][coluna]);
            }
        }
       
        System.out.println("Segunda Matriz: ");
       

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                for (int i = 0; i < 4; i++) {
                    
                   SecondMat[0][0] = vet[4];
                   SecondMat[0][1] = vet[5];
                   SecondMat[1][0] = vet[6];
                   SecondMat[1][1] = vet[7];
                }
                System.out.println("Linha: " + (linha + 1) +
                        " Coluna: " + (coluna + 1) + ": "
                        + SecondMat[linha][coluna]);
            }
        }

    

        int calculo;

        calculo = (firstMat[0][0] * firstMat[1][1]) - (firstMat[1][0] * firstMat[0][1]) + 
                  (SecondMat[0][0] * SecondMat[1][1]) - (SecondMat[1][0] * SecondMat[0][1]);

        System.out.println("Determinante: " + calculo);

        

        
        
   
    }
    
}
