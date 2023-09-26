package dices;

import java.util.Random;

public class Dices {
    
    // Create dices
    int dice;
    public Dices(int dice){
        this.dice = dice;
    }
    
    public int faceDice(){
        Random rand =new Random();
        int faceDice = rand.nextInt(1,this.dice);
        return faceDice;
    }
    
}
