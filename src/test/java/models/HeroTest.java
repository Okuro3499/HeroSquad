package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void createsInstanceOfHero(){
        Hero hero = new Hero ("Storm",26,"Weather modification","Emotionally unstable");
        assertTrue(hero instanceof Hero);
    }

    @Test
    public void savesName(){
        Hero hero = new Hero("Storm",26,"Weather modification","Emotionally unstable");
        assertEquals("Storm", hero.getName());
    }

    @Test
    public void savesAge(){
        Hero hero = new Hero("Storm",26,"Weather modification","Emotionally unstable");
        assertEquals(26, hero.getAge());
    }

    @Test
    public void savesSpecialPower(){
        Hero hero = new Hero("Storm",26,"Weather modification","Emotionally unstable");
        assertEquals("Weather modification", hero.getSpecial_Power());
    }

    @Test
    public void saveWeakness() {
        Hero hero = new Hero("Storm",26,"Weather modification","Emotionally unstable");
        assertEquals("Emotionally unstable", hero.getWeakness());
    }

    @Test
    public void all_ReturnsAll_InstancesOfHero(){
        Hero hero = new Hero("Storm",26,"Weather modification","Emotionally unstable");
        Hero otherHero = new Hero("Jean",23,"Telepathy","Mortal body");
        assertTrue(Hero.all().contains(hero));
        assertTrue(Hero.all().contains(otherHero));
    }

    @Test
    public void clear_EmptiesAllCategoriesFromList_0() {
        Hero.clear();
        assertEquals(Hero.all().size(),0);
    }

    @Test
    public void getId_heroInstantiateWithAnId_1() {
        Hero.clear();
        Hero hero = new Hero("Storm",26,"Weather modification","Emotionally unstable");
        assertEquals(1, hero.getId());
    }

    @Test
    public void find_returnsCategoryWithSameId_secondCategory() {
        Hero.clear();
        Hero hero = new Hero("Storm",26,"Weather modification","Emotionally unstable");
        assertEquals(Hero.find(hero.getId()),hero);
    }

    @Test
    public void find_returnsNullWhenNoTaskFound_null(){
        assertTrue(Hero.find(1000) == null);
    }
}