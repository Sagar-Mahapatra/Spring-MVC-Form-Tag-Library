package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Student;

public interface StudentService {

	boolean registerCourse(Student student);
	List<String> getCourseNames();
	List<String> getCourseTimings();
}
