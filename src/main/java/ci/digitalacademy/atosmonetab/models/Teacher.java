package ci.digitalacademy.atosmonetab.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@DiscriminatorColumn(name = "teacher")
public class Teacher extends Person {

//    @Column(name = "vacant")
    private Boolean vacant;

    @Column(name = "matiereEnseigne")
    private String matiereEnseigne;

    @Column(name = "prochainCours")
    private String prochainCours;

    @Column(name = "sujetProchaineReunion")
    private String sujetProchaineReunion;



//    @OneToMany
//    private Set<NoteSheet> noteSheetSet;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "teacher")
//    private Set<NoteSheet> noteSheet;

}
