public class MainTesting {
    public static void main(String[] args) {
        GestorUsers gestorUsers = new GestorUsers();
        gestorUsers.addUser("Rúben", "M", 6, 12, 2004, "1234");

        System.out.println(gestorUsers);
    }
}
