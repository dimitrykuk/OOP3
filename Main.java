import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import clients.Owner;
import clients.impl.Cat;
import clients.impl.Chicken;
import clients.impl.Dog;
import clients.impl.Goat;
import clients.impl.Goose;
import clients.impl.Hamster;
import clients.impl.Lion;
import clients.impl.Mouse;
import workers.*;
import clients.Animals;

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
        Animals dog = new Dog("Пес", 20, LocalDate.of(1, 01, 01), new Owner());
        Goose goose = new Goose("Гус", 0, null, null);
        Cat cat = new Cat("Кот", 0, null, null);
        Chicken chicken = new Chicken("Кура", 0, null, null);
        Goat goat = new Goat("Козел", 0, null, null);
        Hamster hamster = new Hamster("Хомяк", 0, null, null);
        Lion lion = new Lion("Лев", 0, null, null);
        Mouse mouse = new Mouse("Мышь", 0, null, null);
        
        List<Animals> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(goose);
        animals.add(cat);
        animals.add(chicken);
        animals.add(goat);
        animals.add(hamster);
        animals.add(lion);
        animals.add(mouse);

        
        Doctor doc = new Doctor("Олег Петрович", LocalDate.of(1975, 03, 20), 024);
        Nurse nura = new Nurse("Нюра", LocalDate.of(1960, 11, 21), 50);

        VeterinaryClinic vet1 = new VeterinaryClinic();
        
        vet1.getAllFlyers(animals);
        vet1.toHeir(doc.getInfo());
        doc.doInspection(mouse);
        doc.writeAppointment(mouse,"Analgin");
        nura.makeInjection(dog);
        nura.dictateAppointment(dog, "Paracetomol");
        
        System.out.println(goose.fly(5));

    }
}
