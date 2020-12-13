
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }
    
    @Override
    public String toString() {
        return "" + this.history;
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        ArrayList<Double> tempArrayList = new ArrayList<>(history);
        Collections.sort(tempArrayList);
        return tempArrayList.get(tempArrayList.size() - 1);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        ArrayList<Double> tempArrayList = new ArrayList<>(history);
        Collections.sort(tempArrayList);
        return tempArrayList.get(0);
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        return history.stream().mapToDouble(x -> x).average().getAsDouble();        
    }
}
