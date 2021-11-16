import org.junit.Test;
import java.lang.reflect.Array;
import static org.junit.jupiter.api.Assertions.*;

public class TestBoard {
    @Test
    public void testSetMove_SetsTheMove(){
        Board b = new Board();
        Player p = new Player('X', "test");

        b.SetMove(p, 1, 1);

        assertEquals('X', b.GetCase(1, 1));
    }

    @Test
    public void testSetMove_IncrementTurns(){
        Board b = new Board();
        Player p = new Player('X', "test");

        int expected = b.GetTurns() + 1;

        b.SetMove(p, 1, 1);

        assertEquals(expected, b.GetTurns());
    }

    @Test
    public void testSetMove_IfisThereTTTWorksSetsWinnerIfTTT(){

        // lignes verticales
        Board b = new Board();
        Player p = new Player('X', "test1");

        b.SetMove(p, 1, 1);
        b.SetMove(p, 1, 2);
        b.SetMove(p, 1, 3);

        assertEquals("test1", b.GetWinner().GetName());
        //-----------------------------------------------
        b = new Board();
        p = new Player('X', "test2");

        b.SetMove(p, 2, 1);
        b.SetMove(p, 2, 2);
        b.SetMove(p, 2, 3);

        assertEquals("test2", b.GetWinner().GetName());
        ///-----------------------------------------------
        b = new Board();
        p = new Player('X', "test3");

        b.SetMove(p, 3, 1);
        b.SetMove(p, 3, 2);
        b.SetMove(p, 3, 3);

        assertEquals("test3", b.GetWinner().GetName());

        // lignes Horizontales
        b = new Board();
        p = new Player('X', "test4");

        b.SetMove(p, 1, 1);
        b.SetMove(p, 2, 1);
        b.SetMove(p, 3, 1);

        assertEquals("test4", b.GetWinner().GetName());
        //-----------------------------------------------
        b = new Board();
        p = new Player('X', "test5");

        b.SetMove(p, 1, 2);
        b.SetMove(p, 2, 2);
        b.SetMove(p, 3, 2);

        assertEquals("test5", b.GetWinner().GetName());
        ///-----------------------------------------------
        b = new Board();
        p = new Player('X', "test6");

        b.SetMove(p, 1, 3);
        b.SetMove(p, 2, 3);
        b.SetMove(p, 3, 3);

        assertEquals("test6", b.GetWinner().GetName());

        
        // lignes Diagonales
        b = new Board();
        p = new Player('O', "test7");

        b.SetMove(p, 1, 1);
        b.SetMove(p, 2, 2);
        b.SetMove(p, 3, 3);

        assertEquals("test7", b.GetWinner().GetName());
        //-----------------------------------------------
        b = new Board();
        p = new Player('O', "test8");

        b.SetMove(p, 3, 1);
        b.SetMove(p, 2, 2);
        b.SetMove(p, 1, 3);

        assertEquals("test8", b.GetWinner().GetName());        
    }

    @Test
    public void testSetMove_isCaseEmpty(){
        //if is empty, returns true
        Board b = new Board();
        Player p = new Player('O', "test");

        assertTrue(b.SetMove(p,1, 1));


        //if not empty, returns false
        b = new Board();
        p = new Player('O', "test");

        b.SetMove(p, 1, 1);

        assertFalse(b.SetMove(p,1, 1));
    }

    @Test
    public void testGetWinner(){
        Board b = new Board();
        Player p = new Player('O', "test");

        b.SetMove(p, 3, 1);
        b.SetMove(p, 2, 2);
        b.SetMove(p, 1, 3);

        assertEquals(p, b.GetWinner()); 
    }

    @Test
    public void testGetTurns(){
        Board b = new Board();
        
        int expected = 0;

        assertEquals(expected, b.GetTurns());

        //----When-incremented--------------------

        b = new Board();
        Player p = new Player('O', "test");

        b.SetMove(p, 1, 1);
        b.SetMove(p, 2, 1);
        b.SetMove(p, 3, 1);
        
        expected = 3;

        assertEquals(expected, b.GetTurns());
    }

    @Test
    public void testGetCase(){
        Board b = new Board();
        Player p = new Player('X', "test");

        b.SetMove(p, 1, 1);
        char expected = 'X';

        assertEquals(expected, b.GetCase(1, 1));
    }
}
