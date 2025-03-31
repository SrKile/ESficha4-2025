import java.util.LinkedList;

public class GestorUsers {
    private LinkedList<User> listaUsers;

    public GestorUsers(LinkedList<User> listaUsers) {
        this.listaUsers = new LinkedList<>();
    }

    public void addUser(String name, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        User userAdd = new User(name, gender, dayOfBirth, monthOfBirth, yearOfBirth);
        listaUsers.add(userAdd);
    }

    public boolean removerUser(User user){
        return listaUsers.remove(user);
    }

    public LinkedList<User> getListaUsers() {
        return new LinkedList<>(listaUsers);
    }

    public User getUser(User user) {
        return listaUsers.get(listaUsers.indexOf(user));
    }
}