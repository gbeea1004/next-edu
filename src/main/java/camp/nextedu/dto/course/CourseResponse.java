package camp.nextedu.dto.course;

import camp.nextedu.domain.course.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CourseResponse {

    private String title;
    private String pictureUrl;

    public static CourseResponse of(Course course) {
        return new CourseResponse(course.getTitle(), course.getPictureUrl());
    }
}
