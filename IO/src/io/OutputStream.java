package io;

import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
//        for (int i = 32; i < 127; i++) {
//            System.out.write(i);
//        }
//        System.out.flush();
    
        String text = "Text is written \n";
        byte[] data = text.getBytes();
        
        try{
            System.out.write(data);
        } catch (IOException ex){
            System.out.println(ex);
        } finally {
            System.out.close();
        }
        System.out.flush();
        
    
    }
}
