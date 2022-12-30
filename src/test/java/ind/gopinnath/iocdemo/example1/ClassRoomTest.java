package ind.gopinnath.iocdemo.example1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@Slf4j
public class ClassRoomTest {

    @Autowired
    private ClassRoom systemUnderTest;

    @Test
    public void classroomHappyPath() {

        ClassRegister result = systemUnderTest.markAttendanceForTenthToday(buildStudent());
        log.info(result.toString());
        Assertions.assertEquals(3, result.getAttendance().get(LocalDate.now()).size());
    }

    private List<Student> buildStudent() {
        return Arrays.asList(new Student(1, "Ram"),
                new Student(2, "Shyam"),
                new Student(3, "Alice"));
    }
}
