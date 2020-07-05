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
}