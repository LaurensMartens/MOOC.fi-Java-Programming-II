
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
public class OneItemBox extends Box{
    private ArrayList<Item> oneItemList;
    
    public OneItemBox() {
        this.oneItemList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(oneItemList.isEmpty()) {
            oneItemList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return(oneItemList.contains(item));
    }
    
    
}
