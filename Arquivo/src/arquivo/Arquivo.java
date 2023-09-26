package arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

    public static void escreverTexto(String caminho, String texto) {
        try ( // Não precisa usar o close de recursos porque já usamos try resources
                FileWriter criadoArquivo = new FileWriter(caminho, true); //true -> Cria ou abre o arquivo e escreve ao final do conteúdo do arquivo
                BufferedWriter buffer = new BufferedWriter(criadoArquivo);
                PrintWriter escritorArquivo = new PrintWriter(buffer);
                ){
            escritorArquivo.append(texto);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
