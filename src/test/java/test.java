import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    public void testCreateUser(){
        var user = new User("Rúben", "M", 6,12,2004, "1234");

        assertEquals("Rúben", user.getName());
    }

    @Test
    public void testCreateGestor(){
        var gestor = new GestorUsers();

        assertTrue(gestor instanceof GestorUsers);
    }

    @Test
    public void testRemoveUser(){
        var gestor = new GestorUsers();
        var user = new User("Rúben", "M", 6,12,2004, "1234");

        gestor.addUser("Rúben", "M", 6,12,2004, "1234");
        gestor.addUser(user);

        gestor.removerUser(user);

        var listSise = gestor.getListaUsers().size();
        assertEquals(1, listSise);
    }

    @Test
    public void testRemoveUserPhoneNumber(){
        var gestor = new GestorUsers();
        var user = new User("Rúben", "M", 6,12,2004, "1234");

        gestor.addUser("Rúben", "M", 6,12,2004, "1234");
        gestor.addUser(user);

        gestor.removerUser("1234");

        var listSise = gestor.getListaUsers().size();
        assertEquals(1, listSise);
    }

    @Test
    public void testGetUser(){
        var gestor = new GestorUsers();
        var user = new User("Rúben", "M", 6,12,2004, "1234");

        gestor.addUser("Rúben", "M", 6,12,2004, "1234");
        gestor.addUser(user);

        var userFromlist = gestor.getUser(user);
        assertEquals(user, userFromlist);
    }
}