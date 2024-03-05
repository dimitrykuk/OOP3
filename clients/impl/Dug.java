package clients.impl;

import java.time.LocalDate;

import clients.Animals;
import clients.Flyable;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Dug extends Animals implements Flyable, Goable, Swimable {

    public Dug(String name, double weight, LocalDate adge, Owner owner) {
        super(name, weight, adge, owner);
    }

    @Override
    public void eat() {
       
    }

    @Override
    public double swim(double swimSpeed) {
        return swimSpeed;
    }

    @Override
    public double run(double runSpeed) {
        return runSpeed;
    }

    @Override
    public double fly(double flySpeed) {
        return flySpeed;
    }
    
}
