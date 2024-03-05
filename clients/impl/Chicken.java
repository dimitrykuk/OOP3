package clients.impl;

import java.time.LocalDate;

import clients.Animals;
import clients.Flyable;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Chicken extends Animals implements Flyable, Goable, Swimable{
    public Chicken(String name, float weight, LocalDate adge, Owner owner){
        super(name, weight, adge, owner);
    }

    @Override
    public void eat() {
        System.out.println("клюет");
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
