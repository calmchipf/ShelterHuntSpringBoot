package kz.aitu.shelterhuntspringboot.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private Date date_of_birth;
    private long phone_number;
    private List<Integer> owned_adverts_ids;
    private List<Integer> fav_adverts_ids;
    private List<Integer> reviews_ids;

    private String username;
    private String password;

    public boolean getGender() {  // I added this getter because lombok doesn't make one fsr.
        return gender;
    }

    @Override
    public String toString() {
        return "-[User profile]-" + '\n' +
                "Id:" + id + '\n' +
                "Name and surname: " + name + ' ' + surname + '\n' +
                "Gender: " + (getGender() ? "Male" : "Female") + '\n' +
                "Date of birth: " + date_of_birth + '\n' +
                "Phone number: " + phone_number + '\n' +
                "- Admin stuff -  " + '\n';
    }
}
