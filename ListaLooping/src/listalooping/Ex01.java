package listalooping;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        /* 1.	FAÇA UM PROGRAMA QUE PEÇA UMA NOTA, ENTRE ZERO E DEZ. MOSTRE 
        UMA MENSAGEM CASO O VALOR SEJA INVÁLIDO E CONTINUE PEDINDO ATÉ QUE O
        USUÁRIO INFORME UM VALOR VÁLIDO. */
        
// Declaração das variáveis        
        Scanner teclado = new Scanner(System.in);
        String nota, notaAuxiliar;
        boolean continuar = true;
// Início do looping de repetição
        while (continuar) {
// Limpa a variável auxiliar toda vez que reiniciar o loop por erro de inserção
            notaAuxiliar = "";
// Entrada da nota            
            System.out.print("Insira uma nota de zero a 10: ");
            nota = teclado.next().trim();
// Inicialização da verificação 
            for (int i = 0; i <= nota.length(); i++) {
// Método .isDigit do Character verifica se é Número -> true ou não               
                if (Character.isDigit(nota.charAt(i))) {
                    notaAuxiliar += nota.charAt(i);
// Verifica se toda a nota digitada foi gravada na vairável auxiliar                    
                    if (notaAuxiliar.equals(nota)) {
// Verificar se a nota está dentro do intervalo desejado
                        if (Integer.parseInt(nota)>=0 && 
                                Integer.parseInt(nota) <= 10) {
                            System.out.println("Nota digitada Corretamente");
                            continuar = false;
                            break;
// Caso não esteja no intervalo válido                            
                        } else {
                            System.out.println("Digite uma nota valida.");
                            break;
                        }
                    }
// .isDigit é falso, avisa ao usuário e retorna para o for e reinicia o while
                } else {
                    System.out.println("Digite uma nota valida");
                    break;
                }
            }
        }

        teclado.close();
    }

}
