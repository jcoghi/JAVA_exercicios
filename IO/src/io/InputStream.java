package io;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

    public static void main(String[] args) {

//        try {
//            int data = System.in.read();
//            // Printando apenas o primeiro caracter
//            System.out.write(data);
//            System.out.flush();
//        } catch (IOException ex) {
//            System.out.print(ex);
//        }

//        try {
//            int[] data = new int[20];
//            for (int i = 0; i < data.length; i++) {
//                data[i] = System.in.read();
//            }
//            
//            System.out.print("Entrada: ");
//            for (int i = 0; i < data.length; i++) {
//                System.out.write(data[i]);
//                System.out.flush();
//            }
//        }catch (IOException ex) {
//            System.out.println(ex);
//        }

        try{
            FileInputStream input = new FileInputStream("test.txt");
            
            while(true) {
                int data = input.read();
                if (data == -1) {
                    System.out.println("\n\nAcabou o texto");
                    break;
                } else {
                    System.out.write(data);
                }
                System.out.flush();
                
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

