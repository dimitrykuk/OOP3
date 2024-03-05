package workers;

import java.time.LocalDate;

import clients.Animals;

public class Nurse extends Personal{

    public Nurse(String name, LocalDate age, int workExperience) {
        super(name, age, workExperience);
    }
    
    public void makeInjection(Animals animal){
        System.out.println("Сестра "+ this.getInfo() + "Уколола:" + animal.getAnimInfo());
    }

    public void dictateAppointment(Animals animal, String recipe){
        System.out.println("Сестра "+ this.getInfo() + " Вписала в рецепт: " + recipe + " "+ animal.getAnimInfo());
    }
}
