package in.ashokit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.CourseTiming;

public interface CourseTimingRepository extends JpaRepository<CourseTiming, Serializable> {

	@Query("select courseTime from CourseTiming")
	List<String> getCourseTimings();
	
}
