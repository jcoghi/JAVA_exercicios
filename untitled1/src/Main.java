public class Main {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 15; i >= 1; i--) {
            System.out.printf("Correção em %d minutos \r", i);
            Thread.sleep(60000);
        }
    }
}