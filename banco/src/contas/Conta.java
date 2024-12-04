package contas;

import clientes.Cliente;

import java.util.Random;

public class Conta {
    private double saldo;
    public int agencia;
    public int numero = criaNumero();
    public Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }
    public boolean saca (double valor){
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean tranferir(double valor, Conta destino) {
        if (this.saldo >= valor){
        this.saldo -= valor;
        destino.deposita(valor);
        return true;
        }
        return false;
    }

    public double saldo () {
        return this.saldo;
    }

    private int criaNumero(){
        String [] bancoNumero = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Random indice = new Random();
        String numero ="";
        for (int i = 0; i < 4; i++) {
            numero = numero.concat(bancoNumero[indice.nextInt(bancoNumero.length)]);
        }
        return Integer.parseInt(numero);
    }
}
