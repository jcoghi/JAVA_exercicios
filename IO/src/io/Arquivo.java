package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;


public class Arquivo {

    public static void main(String[] args) throws FileNotFoundException {
        
        // Fluxo de Entrada com Arquivo
        FileInputStream arq = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(arq);
        BufferedReader br = new BufferedReader(isr);
    }
    
}
