

import java.util.ArrayList;
import java.util.List;

import clients.Animals;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;
import workers.Doctor;
import workers.Personal;

public class VeterinaryClinic {
    private List<Animals> animals;
    private List<Personal> personal;

    public VeterinaryClinic(){
        this.animals = new ArrayList<>();
        this.personal = new ArrayList<>();
    }

    public void toHeirPersonal(Personal worker){
        personal.add(worker);
    }
    
    public void firePersonal(Personal worker){
        personal.remove(worker);
    }

    public void premiumDocs(){
        for (Personal pers : personal){
            if (pers instanceof Doctor) {
                System.out.println(pers.getInfo() + " получил " + (int) (Math.random()*10000) + " рублей премии");
            }
        }
    }

    public void addPatient(Animals patient){
        animals.add(patient);
    }
    
    public void removePatient(Animals patient){
        animals.remove(patient);
    }

    public List<Animals> getPatientList(){
        System.out.println(animals);
        return animals;
    }

    public List<Personal> getPersonalList(){
        System.out.println(personal);
        return personal;
    }

    public void getAllRuners() {
        List<Animals> runners = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof Goable) {
                runners.add(animal);
            }
        }
        Printer(runners);
    }

    public void getAllSwimmers() {
        List<Animals> swimmers = new ArrayList<>();
        for (Animals animal : animals) {
            if (animal instanceof Swimable) {
                swimmers.add(animal);
            }
        }
        Printer(swimmers);
    }

    public void getAllFlyers() {
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
}
