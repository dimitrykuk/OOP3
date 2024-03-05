package clients.impl;

import java.time.LocalDate;

import clients.Animals;
import clients.Goable;
import clients.Owner;

public class Cat extends Animals implements Goable{

    public Cat(String name, float weight, LocalDate adge, Owner owner) {
        super(name, weight, adge, owner);
    }

    @Override
    public void eat() {
        System.out.println("ест");
    }

    @Override
    public double run(double runSpeed) {
        return runSpeed;
    }

    
}