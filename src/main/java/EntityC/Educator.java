package EntityC;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "educator")
public class Educator {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "age")
    private int age;

    @Override
    public String toString() {
        return "Educator: \n" +
                "id: " + id +
                "\nname=: " + name +
                "\nsurname=: " + surname +
                "\npatronymic=: " + patronymic +
                "\nage: " + age;
    }
}
