package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    private String name;
    private int age;
    private String special_power;
    private String weakness;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int Id;

    public Hero(String name, int age, String special_power, String weakness) {
        this.name =name;
        this.age = age;
        this.special_power = special_power;
        this.weakness = weakness;
        instances.add(this);
        Id = instances.size();

    }

    public static List<Hero> all() {
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public static Hero find(int id) {
        try{
            return instances.get(id-1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
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

    public int getId() {
        return Id;
    }
}
