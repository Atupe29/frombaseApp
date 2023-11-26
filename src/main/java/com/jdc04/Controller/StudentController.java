package com.jdc04.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdc04.Entity.Student;
import com.jdc04.Service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/")
	public String register(Model model) {
		Student student = new Student();
		model.addAttribute(student);
		return "register";
	}

	@PostMapping("/registerStudent")
	public String registerStudent(@ModelAttribute("student") Student  student) {

		System.out.println(student);
		studentService.registerStudent(student);
		return "registerStudent";
	}
}
