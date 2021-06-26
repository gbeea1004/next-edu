package camp.nextedu.service.course;

import camp.nextedu.domain.course.Course;
import camp.nextedu.dto.course.CourseResponse;
import camp.nextedu.repository.course.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<CourseResponse> findCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream()
                      .map(CourseResponse::of)
                      .collect(Collectors.toList());
    }
}
