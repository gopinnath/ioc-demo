package ind.gopinnath.iocdemo.example3.register;

import ind.gopinnath.iocdemo.example3.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public interface AttendanceRegister {

    void recordAttendance(String standard, Person person);

    List<Person> getClassAttendance(String standard);

    default BiFunction<String, List<Person>, List<Person>> addPerson(Person person) {
        return (key, value ) -> {
            List<Person> personList = Optional
                    .ofNullable(value)
                    .orElseGet(ArrayList::new);
            personList.add(person);
            return personList;
        };
    }
}
