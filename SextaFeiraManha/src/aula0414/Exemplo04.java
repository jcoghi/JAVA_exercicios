package aula0414;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo04 {

    public static void main(String[] args) {

        // Criar um array bidimensional de String com alguns valores
        String[][] array = {{"Nome", "Idade", "Cidade" },
                            {"Ana", "25", "Sao Paulo" },
                            {"Bruno", "32", "Rio de Janeiro"},
                            {"Carla", "28", "Belo Horizonte" }};

                try {
                    // Abrir o arquivo com o nome "array2d.txt"
                    FileWriter writer = new FileWriter("array2d.txt");

                    // Percorrer as linhas do array
                    for (int i = 0; i < array.length; i++) {
                        // Percorrer as colunas do array
                        for (int j = 0; j < array[i].length; j++) {
                            // Escrever o elemento na posição [i][j] no arquivo
                            writer.write(array[i][j]+",");                             
                        }
                        // Mudar de linha após escrever todos os elementos da linha
                        writer.write("\n");
                    }

                    // Fechar o arquivo
                    writer.close();

                    // Exibir uma mensagem de sucesso
                    System.out.println("Array bidimensional salvo no arquivo txt com sucesso!");

                } catch (IOException e) {
                    // Exibir uma mensagem de erro em caso de exceção
                    System.out.println("Erro ao salvar o array bidimensional no arquivo txt: " + e.getMessage());
                }
            }
        }
