package io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Lendo {

    public static void main(String[] args) throws IOException {
        String[][] bd = new String[4][3];
        String data = "";
        int linha = 0;

        try {
            File my = new File("test.txt");
            Scanner myReader = new Scanner(my);
            while (myReader.hasNextLine()) {
                
                data = myReader.nextLine();
                bd[linha] = data.split(",");
                linha++;
            }
            
            for (int i = 0; i < bd.length; i++) {
                System.out.println(Arrays.toString(bd[i])); 
            }
            
            myReader.close();

        } catch (IOException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }
    }
}
