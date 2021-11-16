import org.junit.Test;
import java.lang.reflect.Array;
import static org.junit.jupiter.api.Assertions.*;

public class TestBoard {
    @Test
    public void testSetMoveSetsTheMove(){
        Board b = new Board();
        Player p = new Player('X', "test");

        b.SetMove(p, 0, 0);

        assertEquals('X', b.GetCase(1, 1));
        
    }
    @Test
    public void testSetMoveIncrementTurns(){
        
        
    }
    @Test
    public void testSetMoveisThereTTTWorksandSetsWinnerIfTTT(){
        
        
    }
}
