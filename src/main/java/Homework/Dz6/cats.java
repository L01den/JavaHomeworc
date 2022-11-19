package Homework.Dz6;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

class Cat {
    private String name,breed, color;

    private HashMap<String, LocalDate> vaccinations;
    private HashMap<String, LocalDate> treatmentOfParasites;


    private int age, id;
    private static int idInc;

    public Cat(String name, String breed, String color, int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.id = idInc++;
        this.vaccinations = new HashMap<>();
        this.treatmentOfParasites = new HashMap<>();
    }
    public Cat(String name, int age){
        this(name,"Б/п", "Не указан", age);
    }


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColors(String color) {
        this.color = color;
    }


    public void setVac(String vaccin){
        LocalDate data = LocalDate.now();
        this.vaccinations.put(vaccin, data);
    }

    public HashMap<String, LocalDate> getVac(){
        return vaccinations;
    }

    public void setTreatment(String ter){
        LocalDate data = LocalDate.now();
        this.treatmentOfParasites.put(ter, data);
    }

    public HashMap<String, LocalDate> getTreatment(){
        return treatmentOfParasites;
    }


    public String getColor() {
        return this.color;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return String.format("\nИмя - %s \nПорода - %s \nВозраст - %d\nОкрас - %s\nID - %d\n" , name, breed, age, color, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name) && breed.equals(cat.breed) && color.equals(cat.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, breed, color, age);
//    }
}

