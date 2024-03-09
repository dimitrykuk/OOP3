package dragstore;
public abstract class MedicineComponents implements Comparable<MedicineComponents>{
    private String name;

    private float weight;

    private int power;

    public MedicineComponents(String name, float weight, int power){
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public int compareTo(MedicineComponents o) {
//        return Integer.compare(this.power, o.power);
//        if (this.power > o.power) return 1;
//        else if (this.power < o.power) return -1;
//        else return 0;
        return power - o.power;
    }

    @Override
    public String toString() {
        return "MedicineComponents{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }

    public String getName(){
        return name;
    }

    public int getPower(){
        return power;
    }

    public float getWeight() {
        return weight;
    }
}
