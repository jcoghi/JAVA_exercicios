package rpg;

import java.util.Random;

public class Dados {

    private int numeroFaces;
    
    public Dados(int numeroFaces) {
        this.numeroFaces = numeroFaces;
    }

    public int getFaceDado() {
        int[] faces = new int[numeroFaces];
        Random aleatorio = new Random();
        int indice = aleatorio.nextInt(faces.length);

        for (int i = 1; i <= numeroFaces; i++) {
            faces[i - 1] = i;
        }

        return faces[indice];
    }
}
