package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repository.CourseRepository;
import in.ashokit.repository.CourseTimingRepository;
import in.ashokit.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private CourseRepository courseRepo;
	@Autowired
	private CourseTimingRepository timingsRepo;

	@Override
	public boolean registerCourse(Student student) {
		try {
			Student savedStudent = studentRepo.save(student);
			if (savedStudent != null && savedStudent.getStudentId() != null) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public List<String> getCourseNames() {
		List<String> courseNames = courseRepo.getCourseNames();
		return courseNames;
	}

	@Override
	public List<String> getCourseTimings() {
		List<String> courseTimings = timingsRepo.getCourseTimings();
		return courseTimings;
	}

}
