package clients;

import java.time.LocalDate;

/**
 * Enimals
 */
public abstract class Animals {

    protected String name;
    protected double weight;
    protected LocalDate adge;
    protected Owner owner;
 
    public Animals(String name, double weight, LocalDate adge, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.adge = adge;
        this.owner = owner;
    }

 
    public abstract void eat();

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name = %s, ves = %s, age = %s, owner = %s ", name, weight,adge, owner);
    }
    public String getAnimInfo() {
        return String.format(" %s, %s. ", name, adge);
    }
}