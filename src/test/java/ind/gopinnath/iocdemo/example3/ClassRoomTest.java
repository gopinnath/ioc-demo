package ind.gopinnath.iocdemo.example3;

import ind.gopinnath.iocdemo.example3.person.Person;
import ind.gopinnath.iocdemo.example3.person.Student;
import ind.gopinnath.iocdemo.example3.person.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class ClassRoomTest {

    @Autowired
    private ClassRoom systemUnderTest;

    @Test
    public void classroomHappyPath() {
        systemUnderTest.recordAttendance("X", buildStudent(), buildTeacher());
        systemUnderTest.recordAttendance("IX", buildStudent(), buildTeacher());
    }

    private List<Person> buildStudent() {
        return Arrays.asList(new Student(1, "Ram"),
                new Student(2, "Shyam"),
                new Student(3, "Alice"));
    }

    private List<Person> buildTeacher() {
        return Arrays.asList(new Teacher(1, "Ram Chander"),
                new Teacher(2, "Shyam Chander"),
                new Teacher(3, "Alice Chander"));
    }
}
