
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageMap;
    
    public StorageFacility() {
        this.storageMap = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storageMap.putIfAbsent(unit, new ArrayList<>());
        this.storageMap.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if(!this.storageMap.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return this.storageMap.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {    
        this.storageMap.get(storageUnit).remove(item);
        if(this.storageMap.get(storageUnit).isEmpty()) {
            storageMap.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitList = new ArrayList<>();
        for(String item: storageMap.keySet()) {
            if(this.storageMap.get(item).isEmpty()) {
                continue;
            }
            unitList.add(item);
        }
        return unitList;
    }
    
}
