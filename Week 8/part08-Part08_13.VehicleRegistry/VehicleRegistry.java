
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicles;

    public VehicleRegistry() {
        this.vehicles = new HashMap<>();
    }

    public boolean add(LicensePlate licenseplate, String owner) {
        if (vehicles.containsKey(licenseplate)) {
            return false;
        }
        vehicles.put(licenseplate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (!vehicles.containsKey(licensePlate)) {
            return null;
        }
        return vehicles.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (vehicles.containsKey(licensePlate)) {
            vehicles.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate license : vehicles.keySet()) {
            System.out.println(license);
        }
    }

    public void printOwners() {
        ArrayList<String> ownersPrinted = new ArrayList<>();
        for (String owner : vehicles.values()) {
            if (!ownersPrinted.contains(owner)) {
                System.out.println(owner);
                ownersPrinted.add(owner);
            }
        }
    }
}
