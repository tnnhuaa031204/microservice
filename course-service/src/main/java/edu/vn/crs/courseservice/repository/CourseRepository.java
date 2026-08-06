package edu.vn.crs.courseservice.repository;

import edu.vn.crs.courseservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CourseRepository extends JpaRepository<Course, Long> {
    boolean existsByTenMonHocIgnoreCase(String tenMonHoc);
}
