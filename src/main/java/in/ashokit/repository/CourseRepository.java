package in.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

	@Query("select courseName from Course")
	List<String> getCourseNames();
	
}
