package pacoteio.filewriterreader;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class NovaEscrita {

    public static void main(String[] args) throws IOException {

        //PrintStream ps = new PrintStream("arquivo2.txt");
        PrintWriter ps = new PrintWriter("arquivo2.txt");
        
        ps.println("Testando escrita em arquivo");
        ps.println();
        ps.println("Testando escrita em arquivo");
        
        
        ps.close();
    }
}
