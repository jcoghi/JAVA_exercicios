package aula0602.testes;

public class TesteCodigo {

    public static void main(String[] args) {
        
        char[] letras = {'j','o','a','o'};
        String nome = "";
        
        for (char letra: letras) {
            nome += String.valueOf(letra);
        }
        System.out.println(nome);
    }

}
