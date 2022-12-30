package ind.gopinnath.iocdemo.example1;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@Component
public class AttendanceRecord {

    public ClassRegister studentAttendance(String standard, LocalDate date, List<Student> studentsAttending) {
        return new ClassRegister(standard, new HashMap<>() {{ put(date, studentsAttending); }});
    }
}
