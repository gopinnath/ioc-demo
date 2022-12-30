package ind.gopinnath.iocdemo.example3.register;

import ind.gopinnath.iocdemo.example3.annotation.Teacher;
import ind.gopinnath.iocdemo.example3.person.Person;
import ind.gopinnath.iocdemo.example3.repository.AttendanceRecord;
import org.springframework.stereotype.Component;

import java.util.List;

@Teacher
@Component
public class TeacherAttendance implements AttendanceRegister{

    @Override
    public void recordAttendance(String standard, Person person) {
        AttendanceRecord.getInstance()
                .getTeacherAttendance().compute(standard, addPerson(person));
    }

    @Override
    public List<Person> getClassAttendance(String standard) {
        return AttendanceRecord.getInstance().getTeacherAttendance(standard);
    }
}
