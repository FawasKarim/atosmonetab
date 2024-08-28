package ci.digitalacademy.atosmonetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="utilisateur")
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pseudo",unique = true,nullable = false)
    private String speudo;

    @Column(name = "password")
    private String password;

    @Column(name = "create_date")
    private Instant creationdate;




    //Pour renommer le Id qui a migré
    //@JoinColumn(name = "adresseId")
    //Relation Unidirectionnelle, ici le Id de l'adress migre dans User(User est le maitre, le maitre reçoit toujours la clé étrangère)
    //@OneToOne
    //private Adress adress;

    //Relation bidirectionnel OnetoOne User est le maitre
    @OneToOne
    private Address address;


}
