import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.LinkedList;

public class User {
    private String name;
    private int age;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private LinkedList<Conta> listaContas;
    private String phoneNumber;

    public User(String name, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, String phoneNumber) {
        if(yearOfBirth < 1000 || yearOfBirth > LocalDate.now().getYear()){
            throw new IllegalArgumentException("Invalid year of birth");
        }
        if(dayOfBirth < 1 || dayOfBirth > 31){
            if((dayOfBirth > 28 && monthOfBirth == 2) && Year.isLeap(yearOfBirth)){
                throw new IllegalArgumentException("Invalid day of birth for the month of february");
            }
            throw new IllegalArgumentException("Invalid day of birth");
        }
        if(monthOfBirth < 1 || monthOfBirth > 12){
            throw new IllegalArgumentException("Invalid month of birth");
        }
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.listaContas = new LinkedList<>();
        this.phoneNumber = phoneNumber;

        age = Period.between(LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth), LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public LinkedList<Conta> getListaContas() {
        return new LinkedList<>(listaContas);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dayOfBirth=" + dayOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
 