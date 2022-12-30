package ind.gopinnath.iocdemo.example2.register;

import ind.gopinnath.iocdemo.example2.person.Person;
import ind.gopinnath.iocdemo.example2.repository.AttendanceRecord;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("teacher")
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
