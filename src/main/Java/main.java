import java.time.LocalDate;
import java.time.Year;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1995, 4, 24);
//        Person peter =  new Person("Peter", myBirthday, Person.Sex.MALE, "pjoberg13@gmail.com");
//        peter.printPerson();

        PersonWarehouse people = new PersonWarehouse();
        people.createPerson("Peter", myBirthday, Person.Sex.MALE, "pjoberg13@gmail.com");
        people.createPerson("Chungus", myBirthday, Person.Sex.MALE, "chungus@gmail.com");
        people.createPerson("Blungus", myBirthday, Person.Sex.FEMALE, "blungus@gmail.com");
        people.createPerson("Jongulo", myBirthday, Person.Sex.FEMALE, "jongulo@jongulocorp.net");
        people.createPerson("JoJo", myBirthday, Person.Sex.MALE, "jojo@bizarre.com");

        people.printPersons(new CheckPersonGender() {
            @Override
            public boolean test(Person p) {
                return p.getGender() == Person.Sex.FEMALE;
            }
        });

        people.printPersons((Person p) -> p.getGender() == Person.Sex.MALE);
    }
}
