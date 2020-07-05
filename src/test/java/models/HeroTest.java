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
}