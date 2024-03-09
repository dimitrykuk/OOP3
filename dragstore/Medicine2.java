package dragstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medicine2 implements Iterable<MedicineComponents> {
    private List<MedicineComponents> components;

    private int index;

    public Medicine2() {
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Medicine2 addComponent(MedicineComponents component){
        components.add(component);
        return this;
    }

//    @Override
//    public boolean hasNext() {
//        //return components.iterator().hasNext();
//        return index < components.size();
//    }
//
//    @Override
//    public MedicineComponents next() {
//        //return components.iterator().next();
//        return components.get(index++);
//    }

    @Override
    public String toString() {
        return "Medicine: " + components.toString();
    }

    @Override
    public Iterator<MedicineComponents> iterator() {
        return new Iterator<MedicineComponents>() {
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
        };
    }
}
