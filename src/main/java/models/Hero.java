package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    private String name;
    private int age;
    private String special_power;
    private String weakness;
    private static List<Hero> heroes = new ArrayList<Hero>();
    private int Id;

    public Hero(String name, int age, String special_power, String weakness) {
        this.name =name;
        this.age = age;
        this.special_power = special_power;
        this.weakness = weakness;
        heroes.add(this);
        Id = heroes.size();

    }

    public static List<Hero> all() {
        return heroes;
    }

    public static void clear() {
        heroes.clear();
    }

    public static Hero find(int id) {
        try{
            return heroes.get(id-1);
        } catch (IndexOutOfBoundsException exception) {
            return null;
        }
    }

    public static List<Hero> getHeroes() {
        return heroes;
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

    public void deleteHero() {

    }
}
