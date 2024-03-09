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

    private int getSumPow(){
        int pow = 0;
        for (MedicineComponents medcomp: components){
            pow = pow + medcomp.getPower();
        }
        return pow;
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
      return this.getSumPow()-lec.getSumPow();
    }
}
