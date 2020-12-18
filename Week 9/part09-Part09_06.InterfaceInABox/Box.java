
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
public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> boxItems;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        boxItems = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= maxWeight) {
            boxItems.add(item);
        }
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : boxItems) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + boxItems.size() + " items, total weight " + this.weight() + " kg";
    }

}
