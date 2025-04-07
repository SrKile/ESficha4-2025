import java.util.LinkedList;

public class Conta {
    private User titular;
    private float saldo;
    private LinkedList<Registo> listaRegistos;

    public Conta(User user) {
        this.titular = user;
        this.saldo = 0;
        this.listaRegistos = new LinkedList<>();
    }

    void adicionarRegisto(Registo registo) {
        this.listaRegistos.add(registo);
        this.saldo += registo.getMontante();
    }

}
