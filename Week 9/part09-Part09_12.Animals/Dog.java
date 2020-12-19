/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Dog extends Animal implements NoiseCapable{
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public Dog() {
        name = "Dog";
    }
    
    public void bark() {
        System.out.println(name + " barks");
    }
    
    @Override
    void eat() {
        System.out.println(name + " eats");
    }

    @Override
    void sleep() {
        System.out.println(name + " sleeps");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
    
}
