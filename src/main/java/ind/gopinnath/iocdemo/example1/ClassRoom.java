package ind.gopinnath.iocdemo.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@Primary
public class ClassRoom {

    @Autowired
    private AttendanceRecord attendance;

    public ClassRegister markAttendanceForTenthToday(List<Student> studentList) {
        return attendance.studentAttendance("X", LocalDate.now(), studentList);
    }

}
