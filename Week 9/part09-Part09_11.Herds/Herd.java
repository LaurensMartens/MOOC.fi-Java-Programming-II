
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herdList.add(movable);
    }

    public String toString() {
        String herdPositions = "";
        for (Movable organism : herdList) {
            herdPositions += organism.toString() + "\n";
        }
        return herdPositions;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism : herdList) {
            organism.move(dx, dy);
        }
    }
}
