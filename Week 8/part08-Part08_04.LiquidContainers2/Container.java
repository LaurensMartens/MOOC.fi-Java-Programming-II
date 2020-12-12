/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Container {

    private int liquidAmount;

    public Container() {
        this.liquidAmount = 0;
    }

    public int contains() {
        return liquidAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        liquidAmount = liquidAmount + amount > 100 ? 100 : liquidAmount + amount;
    }

    public void move(int amount, Container container) {
        if (amount < 0) {
            return;
        }
        int finalAmountToMove = liquidAmount < amount ? liquidAmount : amount;
        remove(finalAmountToMove);
        container.add(finalAmountToMove);
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        liquidAmount = liquidAmount - amount < 0 ? 0 : liquidAmount - amount;
    }

    @Override
    public String toString() {
        return liquidAmount + "/100";
    }

}