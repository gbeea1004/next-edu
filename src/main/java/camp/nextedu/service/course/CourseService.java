package camp.nextedu.service.course;

import camp.nextedu.dto.course.CourseResponse;

import java.util.List;

public interface CourseService {

    List<CourseResponse> findCourses();
}
