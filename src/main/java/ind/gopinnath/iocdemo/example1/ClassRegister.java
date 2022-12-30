package ind.gopinnath.iocdemo.example1;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class ClassRegister {

    private final String standard;

    private final Map<LocalDate, List<Student>> attendance;

    private List<Student> students;
}
