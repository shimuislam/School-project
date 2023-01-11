package com.exam.spring;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.exam.spring.classes.Class;
import com.exam.spring.classes.ClassInterface;
import com.exam.spring.section.Section;
import com.exam.spring.section.SectionService;
import com.exam.spring.student.Student;
import com.exam.spring.student.StudentResult;
import com.exam.spring.teacher.Teacher;
import com.exam.spring.teacher.TeacherService;

@Controller
public class SchoolController {
	@Autowired
	private ClassInterface ci;
	
	
	@Autowired
	private SectionService ss;
	
	@Autowired
	private TeacherService tser; 
	

	
	
	
 
 @RequestMapping("/sec/{name}")
 public String findByNameS(@RequestParam String name,Model m) {
 m.addAttribute("section", ci.getSectionName(name));
 return "addClass";
}
 
 @RequestMapping(value = "/addClassForm" ,method = RequestMethod.GET)
	public String addClassForm(Model m) {
		List<Teacher> t = tser.showteacher();	
		m.addAttribute("tl", t);
		List<Section > sec = ss.showSection();
		m.addAttribute("section", sec);
		System.out.println(sec.toString());
		return "addClass";			
	}
 
 
 @RequestMapping(value = "/addSectionForm" ,method = RequestMethod.GET)
	public String addSectionForm(Model m) {
	   List<Class> cls = ci.findAll();
	   System.out.println(cls);
	   m.addAttribute("c", cls);
		List<Teacher > te = tser.showteacher();
		m.addAttribute("t", te);
		
		return "addSection";			
}
 
 

 

}
