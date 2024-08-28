package ci.digitalacademy.atosmonetab.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@ToString
public class NoteSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "note", unique = true, nullable = false)
    private String note;

    @Column(name = "anne", unique = true, nullable = false)
    private String annee;

//    @OneToMany
//    @JoinColumn(name = "teacherr_id")
//    private Teacher teacher;

//   @ManyToOne(fetch = FetchType.EAGER)
//   @JoinColumn(name = "teacher_id")
//   private Teacher teacher;


}
