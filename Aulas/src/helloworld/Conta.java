package helloworld;

/**
 * @author joaof
 */
public class Conta {
    private int numero;
    private int banco;
    private float saldo;
    private Pessoa dono;
    
    public Conta(int numero, float saldo, Pessoa dono) {
        this.numero = numero;
        this.saldo = saldo;
        this.dono = dono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public Pessoa getDono() {
        return dono;
    }
}
