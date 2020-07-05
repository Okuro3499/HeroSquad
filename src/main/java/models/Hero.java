package models;

public class Hero {

    private final String name;
    private final int age;

    public Hero(String name, int age, String special_power, String weakness) {
        this.name =name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
