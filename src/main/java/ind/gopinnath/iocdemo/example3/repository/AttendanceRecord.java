package ind.gopinnath.iocdemo.example3.repository;

import ind.gopinnath.iocdemo.example3.person.Person;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class AttendanceRecord {

    private static AttendanceRecord instance;

    public static AttendanceRecord getInstance() {
        if(instance == null) {
            instance = new AttendanceRecord();
        }
        return instance;
    }

    private final Map<String, List<Person>> studentAttendance = new HashMap<>();

    private final Map<String, List<Person>> teacherAttendance = new HashMap<>();

    public List<Person> getStudentAttendance(String standard) {
        return studentAttendance.get(standard);
    }

    public List<Person> getTeacherAttendance(String standard) {
        return teacherAttendance.get(standard);
    }


}
