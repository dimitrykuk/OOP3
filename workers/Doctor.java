package workers;

import java.time.LocalDate;

import clients.Animals;

public class Doctor extends Personal{
    
    String qualification;

    
    public Doctor(String name, LocalDate age, int workExperience) {
        super(name, age, workExperience);
    }

    public void doInspection(Animals animal){
        System.out.println("Доктор "+ this.getInfo() + "Провел осмотр пациента:" + animal.getAnimInfo());
    }
    
    public void writeAppointment(Animals animal, String recipe){
        System.out.println("Доктор "+ this.getInfo() + " Выписал: " + recipe + " "+ animal.getAnimInfo());
    }
}