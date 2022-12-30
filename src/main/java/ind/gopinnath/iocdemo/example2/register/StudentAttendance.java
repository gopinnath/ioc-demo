package ind.gopinnath.iocdemo.example2.register;

import ind.gopinnath.iocdemo.example2.person.Person;
import ind.gopinnath.iocdemo.example2.repository.AttendanceRecord;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student")
public class StudentAttendance implements AttendanceRegister{

    @Override
    public void recordAttendance(String standard, Person person) {
        AttendanceRecord.getInstance().getStudentAttendance().compute(standard,addPerson(person));
    }

    @Override
    public List<Person> getClassAttendance(String standard) {
        return AttendanceRecord.getInstance().getStudentAttendance(standard);
    }


}
