package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquadTest {
    @Test
    public void creates_instanceOfSquad(){
        Squad squad =  new Squad(5, "Squad 1","Avengers Assemble");
        assertTrue(squad instanceof Squad);
    }

    @Test
    public void saves_maxSize_5(){
        Squad squad =  new Squad(5, "Squad 1","Avengers Assemble");
        assertEquals(5, squad.getMax_size());
    }

    @Test
    public void saves_squadName_squad1(){
        Squad squad =  new Squad(5, "Squad 1","Avengers Assemble");
        assertEquals("Squad 1", squad.getName());
    }

    @Test
    public void savesCause(){
        Squad squad =  new Squad(5, "Squad 1","Avengers Assemble");
        assertEquals("Avengers Assemble", squad.getCause());
    }

    @Test
    public void all_returnsAllInstancesOfSquad() {
        Squad squad =  new Squad(5, "Squad 1","Avengers Assemble");
        Squad squad2 =  new Squad(4, "Squad 3","For Asgard");
        assertTrue(Squad.all().contains(squad));
        assertTrue(Squad.all().contains(squad2));
    }

    @Test
    public void clear_EmptiesAllSquadsFromList_0() {
        Squad.clear();
        assertEquals(Squad.all().size(), 0);
    }

    @Test
    public void squadInstantiatesWithId() {
        Squad.clear();
        Squad squad = new Squad(5, "Squad 1", "Avengers Assemble");
        assertEquals(1, squad.getId());
    }

    @Test
    public void findSquadById(){
        Squad.clear();
        Squad squad = new Squad(5, "Squad 1", "Avengers Assemble");
        assertEquals(Squad.find(squad.getId()), squad);
    }

    @Test
    public void getSquad_initiallyReturnsEmptyList_ArrayList() {
        Squad.clear();
        Squad squad = new Squad(5, "Squad 1", "Avengers Assemble");
        assertEquals(0, squad.getHeroes().size());
    }

    @Test
    public void addsHeroesToList_true() {
        Squad squad = new Squad(5, "Squad 1", "Avengers Assemble");
        Hero hero =  new Hero("Sub-Zero",30,"Freeze breath","Heat");
        squad.addHero(hero);
        assertTrue(squad.getHeroes().contains(hero));
    }
}