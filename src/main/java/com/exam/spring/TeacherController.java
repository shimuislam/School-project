package com.exam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.exam.spring.teacher.Teacher;
import com.exam.spring.teacher.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService ts;
	
	@PostMapping("/teacher")
	public String addTeacher(@ModelAttribute Teacher teacher) {
		ts.addTeacher(teacher);
		return "allTeacherList";
	}

}
