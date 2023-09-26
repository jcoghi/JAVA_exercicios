package listacondicional;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        /*FAÇA UM PROGRAMA DE RESULTADO DE EXAMES EM QUE O USUÁRIO DIGITA O 
        NOME, O ANO DE NASCIMENTO, O SEXO BIOLÓGICO E A QUANTIDADE
        DE HEMOGLOBINA NO SANGUE EM g/gL. o PROGRAMA DEVERÁ INFORMAR SE O
        RESULTADO ESTÁ NORMAL*/
//Declaração das variáveis
        Scanner teclado = new Scanner(System.in);
        String nome;
        String sexo;
        String gestante;
        int idade;
        float hemoglobina;
        int verificacao;
// Entrada dos dados
        System.out.print("Nome Completo: ");
        nome = teclado.nextLine();
        System.out.print("Sexo biologico [M/F]: ");
        sexo = teclado.next().toLowerCase().trim();
        System.out.print("Idade: ");
        idade = teclado.nextInt();
        System.out.print("Quantidade de Hemoglobina: ");
        hemoglobina = teclado.nextFloat();
        // Coleta do número inteiro do m ou f para verificação no switch       
        verificacao = (int) sexo.charAt(0);
// Verificação das idades para classificação
        // Bebês
        if (idade < 2) {
            System.out.printf("%s ainda sem padrao de normalidade.\n", nome);
        } // Crianças entre 2 e 6 anos
        else if (idade >= 2 && idade < 6) {
            if (hemoglobina >= 11.5f && hemoglobina < 13.5f) {
                System.out.printf("%s tem taxa de Hb no sangue dentro da normalidade.\n", nome);
            } else {
                System.out.printf("%s deve procurar um hematologista.\n", nome);
            }
            // Crianças entre 6 e 12 anos
        } else if (idade >= 6 && idade <= 12) {
            if (hemoglobina >= 11.5f && hemoglobina < 15.5f) {
                System.out.printf("%s tem taxa de Hb no sangue dentro da normalidade.\n", nome);
            } else {
                System.out.printf("%s deve procurar um hematologista.\n", nome);
            }
            // Adultos
        } else {
            switch (verificacao) {
                case 109: // homens
                    if (hemoglobina >= 14f && hemoglobina < 18f) {
                        System.out.printf("%s tem taxa de Hb no sangue dentro da normalidade.\n", nome);
                        break;
                    } else {
                        System.out.printf("%s deve procurar um hematologista.\n", nome);
                        break;
                    }

                case 102: // mulheres
                    System.out.println("Gestante? [Sim/Nao]");
                    gestante = teclado.next().toLowerCase().trim();
                    // Gestante
                    if (gestante.contains("sim")) {
                        if (hemoglobina >= 11f) {
                            System.out.printf("%s tem taxa de Hb no sangue dentro da normalidade.\n", nome);
                            break;
                        } else {
                            System.out.printf("%s deve procurar um hematologista.\n", nome);
                            break;
                        }
                    // Não gestante
                    } else if (gestante.contains("nao")) {
                        if (hemoglobina >= 12f && hemoglobina < 16) {
                            System.out.printf("%s tem taxa de Hb no sangue dentro da normalidade.\n", nome);
                            break;
                        } else {
                            System.out.printf("%s deve procurar um hematologista.\n", nome);
                            break;
                        }
                    } else {
                        System.out.println("Informe corretamente se a paciente é gestante");
                    }

                default:
                    System.out.println("Sexo nao foi informado corretamente");
            }
        }

        teclado.close();
    }

}
