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
@Table(schema = "public", name = "groups")
public class Group {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "nameofgroup")
    private String nameofgroup;

    @Column(name = "educatorid")
    private int educatorid;

    @Override
    public String toString() {
        return "Group\n " +
                "number of group: " + id +
                "\nname of group: " + nameofgroup +
                "\neducator id=" + educatorid +
                '\n';
    }
}
