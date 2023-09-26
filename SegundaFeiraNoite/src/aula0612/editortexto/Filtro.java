package aula0612.editortexto;

import java.io.File;

public class Filtro extends javax.swing.filechooser.FileFilter{
    
    public boolean  accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
    }
    
    public String getDescription() {
        return "Documento texto (*.txt)";
    }
}
