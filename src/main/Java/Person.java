import java.time.LocalDate;
import java.util.Random;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this. birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        System.out.println("name: " + this.getName() + "\n" +
                "birthday: " + this.getBirthday() + "\n" +
                "gender: " + this.getGender() + "\n" +
                "email address: " + this.getEmailAddress());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
