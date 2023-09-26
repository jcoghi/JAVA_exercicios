package javaapplication40;
public class Diretor {
    String nome;
    double salario;
    String sexo;
    String carro;
    double salario_final;
    double percentual;
    double vale;
    Diretor(double salario,String s,String veiculo,double pp){
        this.salario=salario;
        this.sexo=s;
        this.carro=veiculo;
        this.percentual=pp;
    }
    public void aumentar_salario(){
        salario_final=salario+salario*percentual;
        if(salario_final>=12000){
            System.out.println("Sem aumento");
        }else{
            System.out.println("Novo Salario: "+salario_final);
        }
    }
    public void vale_transporte(){
        if(this.carro=="sim"){
            System.out.println("\nSem vale-transporte");
        }else{
            System.out.println("\nCom direito a vale-transporte");
            vale=0.05*salario_final;
            System.out.println("\nVale-transporte R$: "+vale);
        }
        
    }
}
