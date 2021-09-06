package in.ashokit.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String registerStudent(@Valid Student student, BindingResult result, Model model) {

		System.out.println(student);

		if (result.hasErrors()) {
			return "StudentReg";
		}

		boolean registerCourse = studentService.registerCourse(student);

		if (registerCourse) {
			model.addAttribute("msg", "Registration Successful...");
// intentionally creating null pointer exception for checking global exception
// handle class working
//			String x = null;
//			x.length();
			return "redirect:/";
		} else {
			model.addAttribute("msg", "Something Went Wrong, Please try again !!!");

		}

		return "StudentReg";
	}

}
