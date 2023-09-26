package io;

import java.io.FileWriter;
import java.io.IOException;


public class Escrevendo {
    public static void main(String[] args) {
        
        try{
            FileWriter myWriter = new FileWriter("test.txt");
            myWriter.write("Testando o texto que sera salvo nesta bagaca.");
            myWriter.close();
            
        } catch (IOException ex) {
            System.out.println("Erro na gravação"); 
            ex.printStackTrace();
        }
        
    }
    
}
