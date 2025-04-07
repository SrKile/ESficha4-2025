import java.util.LinkedList;
import java.util.Objects;

public class GestorUsers {
    private LinkedList<User> listaUsers;

    public GestorUsers() {
        this.listaUsers = new LinkedList<>();
    }

    public void addUser(String name, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, String phoneNumber) {
        User userAdd = new User(name, gender, dayOfBirth, monthOfBirth, yearOfBirth, phoneNumber);
        listaUsers.add(userAdd);
    }

    public void addUser(User user) {
        listaUsers.add(user);
    }

    public boolean removerUser(User user){
        return listaUsers.remove(user);
    }

    public boolean removerUser(String phoneNumber){
        User userToRemove = null;

        for (User listaUser : listaUsers) {
            userToRemove = listaUser;
            if (Objects.equals(userToRemove.getPhoneNumber(), phoneNumber)) {
                break;
            }
        }

        return listaUsers.remove(userToRemove);
    }

    public LinkedList<User> getListaUsers() {
        return new LinkedList<>(listaUsers);
    }

    public User getUser(User user) {
        return listaUsers.get(listaUsers.indexOf(user));
    }


}