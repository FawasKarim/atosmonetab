package ci.digitalacademy.atosmonetab.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@ToString
@DiscriminatorColumn(name = "student")
public class Student extends Person {


//    @Column(name = "matricule", unique = true, nullable = false)
    private String matricule;

    private String classe;
}
