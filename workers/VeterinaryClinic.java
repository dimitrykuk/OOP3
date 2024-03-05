package workers;

import java.util.ArrayList;
import java.util.List;

import clients.Animals;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;

public class VeterinaryClinic {
    public void getAllRuners(List<Animals> animals) {
        List<Animals> runners = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof Goable) {
                runners.add(animal);
            }
        }
        Printer(runners);
    }

    public void getAllSwimmers(List<Animals> animals) {
        List<Animals> swimmers = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof Swimable) {
                swimmers.add(animal);
            }
        }
        Printer(swimmers);
    }

    public void getAllFlyers(List<Animals>  animals) {
        List<Animals> flyers = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof Flyable) {
                flyers.add(animal);
            }
        }
        Printer(flyers);
    }


    private void Printer(List<Animals> specificAnimals){
        if (specificAnimals.isEmpty()) {
            System.out.println("Здесь таких нет");
        } else {
            System.out.println(specificAnimals);
        }
    }


    public void toHeir(Object worker) {
        System.out.println("Принят на работу: " + worker);

    }

    public double paySalary(Object worker) {
        return 1;
    }
    
}
