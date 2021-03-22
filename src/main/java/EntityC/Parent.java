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
@Table(schema = "public", name = "parent")
public class Parent {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;


    @Override
    public String toString() {
        return "Parent: " +
                "\nname='" + name +
                "\nsurname='" + surname +
                "\npatronymic='" + patronymic;
    }
}
