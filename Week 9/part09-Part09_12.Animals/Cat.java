/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Cat extends Animal implements NoiseCapable{
    private String name;
    
    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
        name = "Cat";
    }
    
    public void purr() {
        System.out.println(name + " purrs");
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
        this.purr();
    }

}
