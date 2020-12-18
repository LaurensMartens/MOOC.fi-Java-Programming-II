/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Book implements Packable{

    private double weight;
    private String author, nameOfBook;

    public Book(String author, String nameOfBook, double weight) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }
    
    @Override
    public String toString() {
        return author + ": " + nameOfBook;
    }
}
