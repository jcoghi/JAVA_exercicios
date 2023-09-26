package contadorfor;

public class ContadorFor {

    public static void main(String[] args) {
        String[] nomes = {"João", "Felipe", "Armando", "Fernanda", "Amanda", "Rosane", "Anderson", "Wellington", "Ulton", "Smith", "Charles"};
        for (int contador = 0; contador < nomes.length; contador++) {
            System.out.println(nomes[contador]);
        }
    }
    
}
