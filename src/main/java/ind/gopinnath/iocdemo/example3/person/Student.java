package ind.gopinnath.iocdemo.example3.person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student implements Person{

    private int id;

    private String name;
}
