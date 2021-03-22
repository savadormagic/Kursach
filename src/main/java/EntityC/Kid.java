package EntityC;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@Entity
@NoArgsConstructor
@Table(schema = "public", name = "kid")
public class Kid {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "certificateofborn")
    private int certificateOfBorn;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private int age;

    @Column(name = "groupid")
    private int groupid;

    @Column(name = "parentid1")
    private int parentid1;

    @Override
    public String toString() {
        return "Kid: \n" +
                "name: " + name +
                "\nsurname: " + surname +
                "\npatronymic: " + patronymic +
                "\ncertificate Of Born: " + certificateOfBorn +
                "\naddress: " + address +
                "\nage: " + age +
                "\ngroup id: " + groupid +
                "\n";
    }
}
