package pacoteio.filewriterreader;

import java.io.FileWriter;
import java.io.IOException;

public class ComFileWriter {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("arquivo2.txt");

        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit,"
                + " sed do eiusmod");
        fw.write(System.lineSeparator());
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit"
                + ", sed do eiusmod");

        fw.close();
    }
}
