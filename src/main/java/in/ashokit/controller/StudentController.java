package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

		return "StudentReg";

	}

}
