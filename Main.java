import java.time.LocalDate;

import clients.Owner;
import clients.impl.Cat;
import clients.impl.Chicken;
import clients.impl.Dog;
//import clients.impl.Goat;
import clients.impl.Goose;
//import clients.impl.Hamster;
import clients.impl.Lion;
//import clients.impl.Mouse;
import workers.*;
//import clients.Animals;

// Создать класс Doctor и подумать над его состоянием и поведением.
// Создать класс Nurse(медсестра) и подумать над его состоянием и поведением.

// Создайте интерфейсы Goable, Flyable, Swimable. У интерфейсов должны быть
// методы получения скорости заданного действия: double run(), double fly(), double swim()

// Добавьте наследников этим интерфейсам, но таким образом,
// чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)

// Создать класс ВетеринарнаяКлиника (VeterinaryClinic)
// У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих и всех летающих,
// а также методы для работы с персоналом клиники.

public class Main {
    public static void main(String[] args) {
        
        
        VeterinaryClinic vet1 = new VeterinaryClinic(); 
        Dog dog = new Dog("Пес", 20, LocalDate.of(1, 01, 01), new Owner());
        vet1.addPatient(dog);
        vet1.addPatient(new Goose("Гус", 0, null, null));
        vet1.addPatient(new Cat("Кот", 0, null, null));
        vet1.addPatient(new Chicken("Кура", 0, null, null));
        vet1.addPatient(new Lion("Лев", 0, null, null));
        vet1.getPatientList();

        Doctor Oleg = new Doctor("Олег Петрович", LocalDate.of(1975, 03, 20), 024);
        vet1.toHeirPersonal(Oleg);
        Nurse Nura = new Nurse("Нюра", LocalDate.of(1960, 11, 21), 50);
        vet1.toHeirPersonal(Nura);
        vet1.toHeirPersonal(new Nurse(null, null, 0));
        vet1.toHeirPersonal(new Nurse(null, null, 0));
        vet1.toHeirPersonal(new Doctor(null, null, 0));
        vet1.getPersonalList();

        vet1.premiumDocs();

        vet1.getAllFlyers();

        Oleg.doInspection(dog);
        Nura.dictateAppointment(dog, "Analgin");
        
        System.out.println(dog.run(1));
    }
}
