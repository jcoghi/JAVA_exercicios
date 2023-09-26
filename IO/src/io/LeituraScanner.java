package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class LeituraScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useDelimiter(",");

            String valor1 = linhaScanner.next();
            String valor2 = linhaScanner.next();
            String valor3 = linhaScanner.next();
            String valor4 = linhaScanner.next();
            String valor5 = linhaScanner.next();
            System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);

            linhaScanner.close();
//            
//            String[] palavra = linha.split(",");
//            System.out.println(Arrays.toString(palavra));

        }

        scanner.close();

    }
}
