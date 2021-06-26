package camp.nextedu.domain.course;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MISSION_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @ManyToOne
    @JoinColumn(name = "COURSE_ID")
    private Course course;

    @OneToMany(mappedBy = "mission")
    private List<Contents> contents = new ArrayList<>();
}
