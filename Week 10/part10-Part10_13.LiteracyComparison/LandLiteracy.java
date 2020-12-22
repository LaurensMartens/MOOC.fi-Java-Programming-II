/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class LandLiteracy implements Comparable<LandLiteracy>{
    private String land;
    private String year;
    private String gender;
    private double litRate;
    
    public LandLiteracy(String land, String year, String gender, double litRate) {
        this.land = land;
        this.gender = gender;
        this.litRate = litRate; 
        this.year = year;
    }
    
    public double getLit() {
        return this.litRate;
    }
    
    @Override
    public String toString() {
        return land + " (" + year + "), " + gender + ", " + litRate;
    }

    @Override
    public int compareTo(LandLiteracy land) {
        if(this.litRate > land.getLit()) {
            return 1;
        } else if (this.litRate < land.getLit()) {
            return -1;
        }
        return 0;
    }
}
