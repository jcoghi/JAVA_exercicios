package aula0417;

public class Exemplo02 {

    public static void main(String[] args) {
        
        int num = soraia();
        System.out.println(soraia());
    }

public static int soraia() {
    int num = (int)(Math.random() * 10);
    if (num == 2) {
        soraiaBrava();
        return 0;
    } else{
        return num;
    }
}

public static void soraiaBrava() {
    System.out.println("Nao quero falar com voce");
}

}