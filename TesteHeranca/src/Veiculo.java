public class Veiculo {
//    ATRIBUTOS - características
    protected String carga = "Pessoas";

    // Métodos => Comportamento da classe, o que o objeto consegue fazer
    public void andar(boolean paraFrente){
        if (paraFrente) {
            System.out.println("Esta andando para frente");
        } else {
            System.out.println("Esta andando para tras");
        }
    }

}
