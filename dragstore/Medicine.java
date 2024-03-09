package dragstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine implements Iterator<MedicineComponents>, Comparable<Medicine> {
    private List<MedicineComponents> components;

    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine addComponent(MedicineComponents component){
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        //return components.iterator().hasNext();
        return index < components.size();
    }

    @Override
    public MedicineComponents next() {
        //return components.iterator().next();
        return components.get(index++);
    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public int compareTo(Medicine lec) {
        int pow1 = 0;
        int pow2 = 0;
        while (this.hasNext()) pow1 = pow1 + this.next().getPower();
        while (lec.hasNext()) pow2 = pow2 + lec.next().getPower();
        //this.components.
        return (pow1 - pow2);
    }
}
