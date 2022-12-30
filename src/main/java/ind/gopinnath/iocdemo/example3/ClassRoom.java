package ind.gopinnath.iocdemo.example3;

import ind.gopinnath.iocdemo.example3.annotation.Student;
import ind.gopinnath.iocdemo.example3.annotation.Teacher;
import ind.gopinnath.iocdemo.example3.person.Person;
import ind.gopinnath.iocdemo.example3.register.AttendanceRegister;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("example3")
@Slf4j
public class ClassRoom {

    private final AttendanceRegister studentAttendance;

    private final AttendanceRegister teacherAttendance;

    public ClassRoom(@Student AttendanceRegister studentAttendance,
                     @Teacher AttendanceRegister teacherAttendance) {
        this.studentAttendance = studentAttendance;
        this.teacherAttendance = teacherAttendance;
    }

    public void recordAttendance(String standard, List<Person> students, List<Person> teachers) {
        students.forEach(student -> studentAttendance.recordAttendance(standard, student));
        teachers.forEach(teacher -> teacherAttendance.recordAttendance(standard, teacher));
        log.info("Student Attended :: " + studentAttendance.getClassAttendance(standard));
        log.info("Teacher Attended :: " + teacherAttendance.getClassAttendance(standard));
    }
}
