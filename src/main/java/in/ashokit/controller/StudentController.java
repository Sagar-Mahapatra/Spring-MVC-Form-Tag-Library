package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String loadRegForm(Model model) {

		model.addAttribute("student", new Student());
		model.addAttribute("courses", studentService.getCourseNames());
		model.addAttribute("timings", studentService.getCourseTimings());
//		System.out.println(studentService.getCourseTimings());

		return "StudentReg";

	}

	@PostMapping("/registerStudent")
	public String registerStudent(Student student, Model model) {

		System.out.println(student);

		boolean registerCourse = studentService.registerCourse(student);

		if (registerCourse) {
			model.addAttribute("msg", "Registration Successful...");
		} else {
			model.addAttribute("msg", "Something Went Wrong, Please try again !!!");
		}
		return "StudentReg";

	}

}
