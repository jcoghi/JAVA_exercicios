public class BlackJack {
    public static void main(String[] args) {
        Cartas cartas = new Cartas();
    int numero =(int)(Math.random()*(cartas.cartas.length-1));

        System.out.println("Jogador: " + cartas.cartas[(int)(Math.random()*(cartas.cartas.length-1))] +
                " " +cartas.cartas[(int)(Math.random()*(cartas.cartas.length-1))]);
        System.out.println("Mesa: " + cartas.cartas[(int)(Math.random()*(cartas.cartas.length-1))] +
                " " +cartas.cartas[(int)(Math.random()*(cartas.cartas.length-1))]);
    }

}
