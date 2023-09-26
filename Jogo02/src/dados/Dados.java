package dados;

import java.util.Random;

public class Dados {

    Random num = new Random();

    public int d4() {
        return num.nextInt(1, 4);
    }

    public int d6() {
        return num.nextInt(1, 6);
    }

    public int d8() {
        return num.nextInt(1, 8);
    }

    public int d10() {
        return num.nextInt(1, 10);
    }

    public int d12() {
        return num.nextInt(1, 12);
    }

    public int d20() {
        return num.nextInt(1, 20);
    }
}
