import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonWarehouse implements CheckPerson{

    private List<Person> personList;

    public PersonWarehouse() {
        personList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void createPerson(String name, LocalDate birthday, Person.Sex gender, String email) {
        addPerson(new Person(name, birthday, gender, email));
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void printPersons(CheckPerson tester) {
        for(Person p : personList) {
            if(tester.test(p)) {
                p.printPerson();
            }
        }
    }

    @Override
    public boolean test(Person p) {
        return true;
    }
}
