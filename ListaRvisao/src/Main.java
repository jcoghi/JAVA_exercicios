import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
            
        Scanner entrada = new Scanner(System.in);
        
        int vetorCPF[] = new int[11];
        
        System.out.println("Digite seu nome: ");
        
        String nome = entrada.next();
        
        for(int i = 0; i < vetorCPF.length; i++){
            System.out.println("Digite o " + (i+i) + "o" + " digito do seu CPF: ");
            vetorCPF[i] = entrada.nextInt();
        }
        
        int somaCPF = 8;
        
        for(int i = 0; i < vetorCPF.length; i++) {
            somaCPF += vetorCPF[i];
        }
        
        int divisao = vetorCPF[2] / vetorCPF[4];
        
         if (divisao == 0) {
            int restoDivisao = vetorCPF[2] % vetorCPF[4];
            String codigo = "" + nome.charAt(0) + nome.charAt(2);
            System.out.println("Bem vindo " + nome + " seu codigo e: " + codigo + somaCPF + " - " + restoDivisao);
        } else {
            int restoDivisao = vetorCPF[2] % (1 + vetorCPF[8]);
            String codigo = "" + nome.charAt(0) + nome.charAt(2);
            System.out.println("Bem vindo " + nome + " seu codigo e: " + codigo + somaCPF + " - " + restoDivisao);
        }
    }    
}
