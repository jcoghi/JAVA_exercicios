package aula0508.poo.exemplo.veiculos;

public class Veiculo {
//    ATRIBUTOS - características

    private String tipoDeCarga = "Pessoas";
//    private boolean temRodas = true;

//    private int peso;
//    private String chassis;
//    private String modelo;

//    Método Construtor
//    public Veiculo(boolean temRodas, int qtdRodas, boolean motorizacao, int potencia) {
//        this.temRodas = temRodas;
//        
//        if (this.temRodas) {
//            this.qtdRodas = qtdRodas;
//        } else {
//            this.qtdRodas = 0;
//        }
//        
//        this.motorizacao = motorizacao;
//        
//        if (this.motorizacao) {
//            this.potencia = potencia;
//        } else {
//            this.potencia = 1;
//        }   
//    }
    
    // Métodos => Comportamento da classe, o que o objeto consegue fazer
    public void andar(boolean paraFrente){
        if (paraFrente) {
            System.out.println("Estou andando para frente");
        } else {
            System.out.println("Esta andando para tras");
        }
    }
    
    // Métodos de acesso aos atributos - GET e SET
//    public void setTipoDeCarga(String tipoDeCarga) {
//        this.tipoDeCarga = tipoDeCarga;
//    }
//    
//    public String getTipoDeCarga(){
//        return tipoDeCarga;
//    }
//
//    public boolean isTemRodas() {
//        return temRodas;
//    }
//
//    public void setTemRodas(boolean temRodas) {
//        this.temRodas = temRodas;
//    }
//
//    public int getQtdRodas() {
//        return qtdRodas;
//    }
//
//    public void setQtdRodas(int qtdRodas) {
//        this.qtdRodas = qtdRodas;
//    }
//
//    public boolean isMotorizacao() {
//        return motorizacao;
//    }
//
//    public void setMotorizacao(boolean motorizacao) {
//        this.motorizacao = motorizacao;
//    }
//
//    public double getPotencia() {
//        return potencia;
//    }
//
//    public void setPotencia(double potencia) {
//        this.potencia = potencia;
//    }
//
//    public int getPeso() {
//        return peso;
//    }
//
//    public void setPeso(int peso) {
//        this.peso = peso;
//    }
//
//    public String getChassis() {
//        return chassis;
//    }
//
//    public void setChassis(String chassis) {
//        this.chassis = chassis;
//    }
//
//    public String getModelo() {
//        return modelo;
//    }
//
//    public void setModelo(String modelo) {
//        this.modelo = modelo;
//    }
//
//    public String getEnergiaConsumida() {
//        return energiaConsumida;
//    }
//
//    public void setEnergiaConsumida(String energiaConsumida) {
//        this.energiaConsumida = energiaConsumida;
//    }
//    
}

