package camp.nextedu.controller.course;

import camp.nextedu.dto.course.CourseResponse;
import camp.nextedu.service.course.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("")
    public ResponseEntity<List<CourseResponse>> findAllCourses() {
        return ResponseEntity.ok(courseService.findCourses());
    }
}
