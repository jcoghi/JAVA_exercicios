package listacondicional;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        /*O USUÁRIO INFORMA O TIPO SANGUÍNEO DO PACIENTE COMO O FATOR Rh
        O PROGRAMA INFORMARÁ QUAL TIPO SENGUÍNEO ELE PODE RECEBER.
         */
// Declaração das variáveis            
        Scanner teclado = new Scanner(System.in);
        String tipoSanguePaciente;
// Entrada dos dados            
        System.out.print("Informe o tipo senguineo do paciente com fator Rh:  ");
        tipoSanguePaciente = teclado.nextLine().toUpperCase().trim();

        switch(tipoSanguePaciente.length()) {
            case 2:
            if (tipoSanguePaciente.contains("A+")) {
                System.out.println("Paciente pode receber: A+, A-, O+ e O-");
                break;
            } else if (tipoSanguePaciente.contains("A-")) {
                System.out.println("Paciente pode receber: A- e O-");
                break;
            } else if (tipoSanguePaciente.contains("B+")) {
                System.out.println("Paciente pode receber: B+, B-, O+ e O-");
                break;
            } else if (tipoSanguePaciente.contains("B-")) {
                System.out.println("Paciente pode receber: B- e O-");
                break;
            } else if (tipoSanguePaciente.contains("O+")) {
                System.out.println("Paciente pode receber: O+ e O-");
                break;
            } else if (tipoSanguePaciente.contains("O-")) {
                System.out.println("Paciente pode receber: O-");
                break;
            }
            case 3:
            if (tipoSanguePaciente.contains("AB+")) {
                System.out.println("Paciente pode receber: A+, A-, B+, B-, AB+, AB-, O+ e O-");
                break;
            } else if (tipoSanguePaciente.contains("AB-")) {
                System.out.println("Paciente pode receber: A-, B-, AB- e O-");
                break;
            }
            default:
                System.out.println("Informe o tipo sanguineo corretamente");
        }

        teclado.close();
    }
}
