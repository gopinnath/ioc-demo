package ind.gopinnath.iocdemo.example2.person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher implements Person{

    private int id;

    private String name;
}
