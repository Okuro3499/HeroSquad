package models;

public class Hero {

    private final String name;
    private final int age;
    private final String special_power;
    private final String weakness;

    public Hero(String name, int age, String special_power, String weakness) {
        this.name =name;
        this.age = age;
        this.special_power = special_power;
        this.weakness = weakness;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecial_Power() {
        return special_power;
    }

    public String getWeakness() {
        return weakness;
    }
}
