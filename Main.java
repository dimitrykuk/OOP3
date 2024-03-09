import java.time.LocalDate;
import java.util.*;

import clients.Owner;
import clients.impl.Cat;
import clients.impl.Chicken;
import clients.impl.Dog;
//import clients.impl.Goat;
import clients.impl.Goose;
//import clients.impl.Hamster;
import clients.impl.Lion;
//import clients.impl.Mouse;
import dragstore.Medicine;
import dragstore.Medicine2;
import dragstore.MedicineComponents;
import dragstore.impl.Azitromid;
import dragstore.impl.Piniciline;
import dragstore.impl.Vebicide;
import workers.*;
//import clients.Animals;

//Добавить интерфейс Copmparable<Medicine> к классу Medicine. Переопределить метод compareTo()
//
//Создать несколько экземпляров Medicine(лекарство), добавить их в ArrayList, написать метод, выводящий Medicine в отсортированном виде.
//
//        *(усложненное, не обязательное) Постараться написать еще 1 метод сортировки лекарств, но уже по другому параметру
//Формат сдачи: ссылка на гит

public class Main {

    public static void main(String[] args) {
        Azitromid azitromid1 = new Azitromid("az1", 2.1f, 10);
        Piniciline pinic1 = new Piniciline("pin1", 3.1f, 10);
        Vebicide vebic1 = new Vebicide("veb1", 51.2f, 100);

        Azitromid azitromid2 = new Azitromid("az2", 2.1f, 1);
        Piniciline pinic2 = new Piniciline("pin2", 3.1f, 50);
        Vebicide vebic2 = new Vebicide("veb2", 51.2f, 10);

        Azitromid azitromid3 = new Azitromid("az3", 2.1f, 100);
        Piniciline pinic3 = new Piniciline("pin3", 3.1f, 2);
        Vebicide vebic3 = new Vebicide("veb3", 51.2f, 1);

        Medicine medicine1 = new Medicine();
        Medicine medicine2 = new Medicine();
        Medicine medicine3 = new Medicine();
        medicine1.addComponent(azitromid1).addComponent(pinic1).addComponent(vebic1);
        medicine2.addComponent(azitromid2).addComponent(pinic2).addComponent(vebic2);
        medicine3.addComponent(azitromid3).addComponent(pinic3).addComponent(vebic3);

        ArrayList<Medicine> medList = new ArrayList<>();
        medList.add(medicine1);
        medList.add(medicine2);
        medList.add(medicine3);

        for (Medicine med : medList) {
           System.out.println(med);
        }

        Collections.sort(medList);

        System.out.println("");
        for (Medicine med : medList) {
            System.out.println(med);
        }
    }
}
