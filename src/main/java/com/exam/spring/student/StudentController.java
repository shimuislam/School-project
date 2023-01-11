package com.exam.spring.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.spring.feeCollection.FeeRepository;
import com.exam.spring.feeCollection.StudentFee;
import com.exam.spring.teacher.Teacher;
import com.exam.spring.teacher.TeacherService;

@Controller
public class StudentController {
	@Autowired
	private StudentService ss;

	@Autowired
	private TeacherService ts;

	@Autowired
	private StudentResultService srs;

	@Autowired
	private StudentResultInterface sri;

	@Autowired
	private FeeRepository studentFee;

	@RequestMapping("/dashboard")
	public String dash() {
		return "dashboard";
	}

	// @RequestMapping("/")
	// public String logIn(@ModelAttribute User user ) {
	// String ret="";
	// User u =us.showById(user.getId());
	// if(u.password.matches(user.password)) {
	// ret ="allStudent";
	// return ret;
	// }
	// return "allStudent";
	// }
	//
	@RequestMapping(value = "/admission", method = RequestMethod.GET)
	public String admission(@ModelAttribute("student") Student student, Model model) {

		return "allStudent";

	}

	@RequestMapping(value = "/saveAdmission", method = RequestMethod.POST)
	public String allStudent(@ModelAttribute("student") Student student, Model model) {
		System.out.println("admission");
		String sid = "ID" + Math.round(Math.random() * 100000);
		student.setSid(sid);
		StudentResult sr = new StudentResult();
		sr.setName(student.name);
		sr.setSid(sid);
		sri.save(sr);
		ss.addStudent(student);
		List<Student> st = ss.allStudent();
		model.addAttribute("st", st);

		StudentFee stfee = new StudentFee();

		stfee.setSid(sid);
		stfee.setName(student.name);
		if (student.classes.matches("5")) {
			stfee.setFee(400);
		} else if (student.classes.matches("6")) {
			stfee.setFee(600);
		} else if (student.classes.matches("7")) {
			stfee.setFee(800);
		} else if (student.classes.matches("8")) {
			stfee.setFee(850);
		} else if (student.classes.matches("9")) {
			stfee.setFee(950);
		} else if (student.classes.matches("10")) {
			stfee.setFee(1200);
		}
		stfee.setDate(student.date);
		stfee.setDui(stfee.getFee() * 12);

		studentFee.save(stfee);

		return "allStudentList";
	}

	@RequestMapping(value = "/allStudentList", method = RequestMethod.GET)
	public String allstudentList(@ModelAttribute("student") Student student, Model model) {
		System.out.println("admission");
		List<Student> st = ss.allStudent();
		model.addAttribute("st", st);
		return "allStudentList";
	}

	@RequestMapping(value = "/allTeacherList", method = RequestMethod.GET)
	public String allteacherList(@ModelAttribute("teacher") Teacher teacher, Model model) {
		System.out.println("Teacher");
		List<Teacher> t = ts.showteacher();
		model.addAttribute("st", t);
		return "allTeacherList";
	}

	@GetMapping("/show")
	public String showStudent(@ModelAttribute("student") Student student, Model model) {
		List<Student> st = ss.allStudent();
		model.addAttribute("st", st);
		return "allStudentList";

	}

	@RequestMapping(value = "/updatef/{id}")
	public String updatef(@PathVariable("id") int id, Model model) {
		Student s = ss.showById(id);
		model.addAttribute("s", s);
		return "update";
	}

	@RequestMapping(value = "/update")
	public String update(@ModelAttribute Student student, Model model) {
		ss.updateStudent(student);
		List<Student> st = ss.allStudent();
		model.addAttribute("st", st);
		return "allStudentList";
	}

	@RequestMapping(value = "/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id, Model model) {
		Student s = ss.showById(id);
		ss.deleteStudent(s);
		model.addAttribute("st", ss.allStudent());
		return "allStudentList";
	}

	@RequestMapping(value = "/deleteteacher/{id}")
	public String deleteTeacher(@PathVariable("id") int id, Model model) {
		System.out.println("deleteteacher");
		Teacher t = ts.showById(id);
		ts.deleteTeacher(t);
		model.addAttribute("st", ts.showteacher());
		return "allTeacherList";
	}

	@RequestMapping(value = "/updateTeacherf/{id}")
	public String updateteacher(@PathVariable("id") int id, Model model) {
		Teacher t = ts.showById(id);
		model.addAttribute("s", t);
		return "updateTeacher";
	}

	@RequestMapping(value = "/updatet")
	public String updatetf(@ModelAttribute Teacher teacher, Model model) {
		System.out.println("upadateteacher");
		ts.updateTeacher(teacher);
		List<Teacher> t = ts.showteacher();
		model.addAttribute("st", t);
		return "allTeacherList";
	}

	@PostMapping(value = "/addTeacher")
	public String addTeacher(@ModelAttribute("teacher") Teacher teacher, Model model) {
		System.out.println("Adding Teacher");
		ts.addTeacher(teacher);
		List<Teacher> st = ts.showteacher();
		model.addAttribute("st", st);
		return "allTeacherList";
	}

	@RequestMapping(value = "/addTeacherForm")
	public String addTeacherForm() {
		return "allTeacher";
	}

	@RequestMapping(value = "/resultForm", method = RequestMethod.GET)
	public String result(@ModelAttribute("sr") StudentResult sr, Model model) {

		return "studentResultSheet";

	}

	@RequestMapping(value = "/saveResult", method = RequestMethod.POST)
	public String allStudent(@ModelAttribute("sr") StudentResult sr, Model model) {
		System.out.println("admission");
		StudentResult srr = sri.findBySid(sr.sid);
		srr.setBangla(sr.bangla);
		srr.setEnglish(sr.english);
		srr.setMath(sr.math);
		srr.setgk(sr.gk);
		srr.setbgs(sr.bgs);
		sri.save(srr);

		// StudentResult srr = sri.findBySid("ID51930");
		// srr.setBangla(100);
		// srr.setMath(10);
		// sri.save(srr);
		// System.out.println(srr);
		List<StudentResult> str = srs.allStudentResult();
		model.addAttribute("st", str);
		return "dashboard";
	}

}
