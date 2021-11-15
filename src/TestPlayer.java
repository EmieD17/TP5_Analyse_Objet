import org.junit.Test;
import java.lang.reflect.Array;
import static org.junit.jupiter.api.Assertions.*;

public class TestPlayer {
    @Test
    public void testSetSymbol(){
        Player p = new Player('X', "test");

        p.SetSymbol('O');

        assertEquals('O', p.GetSymbol());
    }

    @Test
    public void testGetSymbol(){
        Player p = new Player('X', "test");

        assertEquals('X', p.GetSymbol());
    }

    @Test
    public void testSetName(){
        Player p = new Player('X', "test");

        p.SetName("Test2");

        assertEquals("Test2", p.GetName());
    }
    

    @Test
    public void testGetName(){
        Player p = new Player('X', "test");

        assertEquals("test", p.GetName());
    }
}
