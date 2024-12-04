import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Monstro[] lsm = new Monstro[3];
        int i = 0;
        for (ListaMonstro m : ListaMonstro.values()) {
            lsm[i] = new Monstro(m);
            i++;
        }

        for (Monstro m : lsm) {
            System.out.println(m.toString());
        }


    }
}


