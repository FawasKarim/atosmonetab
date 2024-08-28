package ci.digitalacademy.atosmonetab.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "country", unique = true, nullable = false)
    private String country;

    @Column(name = "city", unique = true, nullable = false)
    private String city;

    @Column(name = "street", unique = true, nullable = false)
    private String street;

    //Relation Bidirectionnel, ici Address est l'esclace donc il reçoit le mappedBy et prens en compte l'attribut de Adress donner dans user
    //@OneToOne(mappedBy = "address")
//    private User user;

}
