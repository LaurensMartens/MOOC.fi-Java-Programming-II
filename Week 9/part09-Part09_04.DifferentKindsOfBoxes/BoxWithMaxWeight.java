
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class BoxWithMaxWeight extends Box {
    private final int maxWeight;
    private int currentWeight;
    private ArrayList<Item> boxList;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.boxList = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(item.getWeight() + currentWeight <= maxWeight) {
            boxList.add(item);
            currentWeight += item.getWeight();
        } else {
            
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return (boxList.contains(item));
    }
    

}
