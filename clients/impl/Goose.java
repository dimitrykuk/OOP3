package clients.impl;

import java.time.LocalDate;

import clients.Animals;
import clients.Flyable;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Goose extends Animals implements Flyable, Swimable, Goable{
    public Goose(String name, float weight, LocalDate adge, Owner owner){
        super(name, weight, adge, owner);
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

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }
    
}