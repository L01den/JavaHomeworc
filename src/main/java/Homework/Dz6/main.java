package Homework.Dz6;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5);
        Cat cat5 = new Cat("Барсик", 5);
        Cat cat2 = new Cat("Мурка", 2);
        cat2.setColors("Чёрный");
        Cat cat3 = new Cat("Барсик", 5);
        cat3.setColors("Рыжий");
        Cat cat4 = new Cat("Граф", "Сиамская", "Кремовый", 5);

//        cat4.setVac("Бешенство");
//        cat4.setVac("Лептоспироз");
//        cat4.setTreatment("Гельминты");
//        System.out.println(cat4.getVac());
//        System.out.println(cat4.getTreatment());

        Set<Cat> myCats = new HashSet<>();
        myCats.add(cat1);
        myCats.add(cat2);
        myCats.add(cat3);
        myCats.add(cat4);
        System.out.println(myCats);

    }
}
