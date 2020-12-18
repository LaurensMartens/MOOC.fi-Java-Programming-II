/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class CustomTacoBox implements TacoBox{
    private int amountOfTacos;
    
    public CustomTacoBox(int amountOfTacos) {
        this.amountOfTacos = amountOfTacos;
    }

    @Override
    public int tacosRemaining() {
        return amountOfTacos;
    }

    @Override
    public void eat() {
        if (amountOfTacos > 0) {
            amountOfTacos -= 1;
        }
    }
    
}
