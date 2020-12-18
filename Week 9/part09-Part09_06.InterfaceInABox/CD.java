/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class CD implements Packable{
    private double weight;
    private String artist, nameOfCD;
    private int publicationYear;
    
    public CD(String artist, String nameOfCD, int publicationYear) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }
    
    @Override
    public double weight() {
        return weight;
    }
    
        @Override
    public String toString() {
        return artist + ": " + nameOfCD + " (" + publicationYear + ")";
    }
}
