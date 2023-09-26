package listafor;

public class Ex09 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 10; i > 0; i--) {
            System.out.printf("Começaremos em %d minutos \r", i);
            Thread.sleep(1000);
        }

        System.out.println("Estamos começando!!!");

    }

}
