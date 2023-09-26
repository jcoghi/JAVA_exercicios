package aula0411;

import java.util.Arrays;

public class Arredondamento {

    public static void main(String[] args) {

    String[][] dataBase = {{"Joao","1000", "1500.00"},
                               {"Felipe","500", "500.00"},
                               {"Danilo","1500", "800.00"}};
        int meta = 600;
        String[] vendedores = new String[dataBase.length];
        int[] vendas = new int[dataBase.length];
        float[] salarios = new float[dataBase.length];

        for (int i = 0; i < dataBase.length; i++) {
            vendedores[i] = dataBase[i][0];
            vendas[i] = Integer.parseInt(dataBase[i][1]);
            salarios[i] = Float.parseFloat(dataBase[i][2]);
        }

        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] < meta){
                System.out.println(vendedores[i] + " nao atingiu a meta");
            } else {
                if (vendas[i] >= meta * 1.1) {
                    float salario = Math.round( (float)salarios[i] * 110) /100;
                    System.out.printf("%.2f\n",salarios[i]);
                } else {
                    System.out.println(vendedores[i] + " bateu a meta, mas nao tem bonus de salário");
                }
            }
        }
  }
}
