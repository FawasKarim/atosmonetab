package ci.digitalacademy.atosmonetab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //Pour l'héritage elle est toujours sur la classe Abstraite(Parent)
@DiscriminatorColumn(name = "person_type") //Permettre de savoir quel est le type d'objet dans la table person
@Table (name = "person")
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String ville;

    @Column (name = "first_name", nullable = false)
    private String firstName;

    @Column (name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column (name = "tel", nullable = false, unique = true)
    private String tel;

    private Boolean sexe;

    private LocalDate dateNaissance;
}
