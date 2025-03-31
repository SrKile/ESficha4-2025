import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    public void testCreateUser(){
        var user = new User("Rúben", "M", 6,12,2004);

        assertEquals("Rúben", user.getName());
    }

    @Test
    public void testCreateGestor(){
        var gestor = new GestorUsers();

        assertTrue(gestor instanceof GestorUsers);
    }
}