package camp.nextedu.domain.course;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COURSE_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PICTURE_URL")
    private String pictureUrl;

    @OneToMany(mappedBy = "course")
    private List<Mission> missions = new ArrayList<>();
}
