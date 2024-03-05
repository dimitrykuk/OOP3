package clients.impl;

import java.time.LocalDate;

import clients.Animals;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Hamster extends Animals implements Goable, Swimable{
    public Hamster(String name, double d, LocalDate adge, Owner owner){
        super(name, d, adge, owner);
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    @Override
    public double swim(double swimSpeed) {
        return swimSpeed;
    }

    @Override
    public double run(double runSpeed) {
        return runSpeed;
    }
    

}
