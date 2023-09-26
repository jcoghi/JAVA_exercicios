package listalooping;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        /* 3.	FAÇA UM PROGRAMA QUE LEIA E VALIDE AS SEGUINTES INFORMAÇÕES:
                    a.	NOME: MAIOR QUE 3 CARACTERES;
                    b.	IDADE: ENTRE 0 E 150;
                    c.	SALÁRIO: MAIOR QUE ZERO;
                    d.	SEXO: 'F' OU 'M';
                    e.	ESTADO CIVIL: 'S', 'C', 'V', 'D' 
         */
// Declaração das variáveis
        Scanner teclado = new Scanner(System.in);
        String civil, sexo, nome;
        int idade;
        float salario;
        boolean verifica = true;

// Verificação Nome
        do {
            System.out.print("Nome Completo: ");
            nome = teclado.nextLine();
            if (nome.length() >= 3) {
                verifica = false;
            } else {
                System.out.println("Digite um nome com, pelo menos, 3 caracteres.");
            }
        } while (verifica);
// Entrada e Verificação da idade
        verifica = true;
        do {
            System.out.print("Idade: ");
            idade = teclado.nextInt();
            if (idade >= 0 && idade < 150) {
                verifica = false;
            } else {
                System.out.println("Digite uma idade entre Zero e 150.");
            }
        } while (verifica);
// Entrada e Verificação do Sexo
        verifica = true;
        while (verifica) {
            System.out.print("Sexo [M/F]: ");
            sexo = teclado.next().toUpperCase().trim();
            switch (sexo) {
                case "M":
                    while (verifica) {
                        System.out.print("Salario: ");
                        salario = teclado.nextFloat();
                        if (salario > 0) {
                            verifica = false;
                            break;
                        } else {
                            System.out.println("Informe um salario maior do que Zero.");
                        }
                    }
                    verifica = false;
                    break;
                case "F":
                    while (verifica) {
                        System.out.print("Salario: ");
                        salario = teclado.nextFloat();
                        if (salario > 0) {
                            verifica = false;
                            break;
                        } else {
                            System.out.println("Informe um salario maior do que Zero.");
                        }
                    }
                    verifica = false;
                    break;
                default:
                    System.out.println("Digite M para masculino e F para feminino.");
            }
        }

        teclado.close();
    }
}
