package aula0512.poo.heranca.exemplo;

public class Mamifero {
    
    private boolean mamas = true;
    
    public void comunicacao() {
        System.out.println("Sou um mamifero");
    }

    public boolean getMamas() {
        return mamas;
    }

    public void setMamas(boolean mamas) {
        this.mamas = mamas;
    }

}
