package clients.impl;

import java.time.LocalDate;

import clients.Animals;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Dog extends Animals implements Goable, Swimable{
        public Dog(String name, float weight, LocalDate adge, Owner owner){
        super(name, weight, adge, owner);
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
