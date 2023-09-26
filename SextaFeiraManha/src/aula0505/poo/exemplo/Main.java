/*SIMULADOR DE ACIDENTE*/
package aula0505.poo.exemplo;

public class Main {

    public static void main(String[] args) {
        //Criçaão dos carros
        // Criação de objetos -> Instanciar os objetos
        Carro uno = new Carro("Prata", "Hatch",
                16, 1.0);
        uno.numeroPortas = 4;

        System.out.println("Velocidade incial: " + uno.velocidade);

        for (int i = 0; i < 100; i++) {
            if (uno.velocidade <= 70 && uno.x <= 5) {
                uno.acelerar();
            } else if (uno.velocidade > 0 && uno.x > 5) {
                uno.frear();
            } else {
                if (uno.x == 10 && uno.velocidade > 0) {
                    System.out.println("Bateu no muro");
                    System.out.println("Nao temos mais um uno");
                    uno.velocidade = 0;
                    break;
                }

            }
        }
        System.out.println("Velocidade atual: " + uno.velocidade);

//        
//        System.out.println("Velocidade final: " + uno.velocidade);
//        System.out.println("Nosso Uno tem:"
//                + "\n Cor: " + uno.cor 
//                + "\n Motor: " + uno.motor
//                + "\n Categoria: " + uno.categoria 
//                + "\n Rodas: " + uno.numeroRodas 
//                + "\n Aro: " + uno.aroRodas 
//                + "\n Numero Portas: " + uno.numeroPortas);
//        Carro d20 = new Carro("Laranja", "Picape",
//                21,4.0);
//        
//        System.out.println("\nNossa D20 tem:"
//                + "\n Cor: " + d20.cor 
//                + "\n Motor: " + d20.motor
//                + "\n Categoria: " + d20.categoria 
//                + "\n Rodas: " + d20.numeroRodas 
//                + "\n Aro: " + d20.aroRodas 
//                + "\n Numero Portas: " + d20.numeroPortas);
    }
}
