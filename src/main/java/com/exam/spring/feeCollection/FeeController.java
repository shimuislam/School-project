package com.exam.spring.feeCollection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.exam.spring.student.Student;
import com.exam.spring.student.StudentInterface;
import com.exam.spring.studentSubject.StudentSubject;
import com.exam.spring.studentSubject.StudentSubjectRepository;

@Controller
@RequestMapping("/fee")
public class FeeController {

	@Autowired
	private FeeRepository feeRepo;

	@Autowired
	private StudentInterface studentInterface;
	@Autowired
	private StudentSubjectRepository studentSubjectRepository;

	@RequestMapping("/feeCalculation")
	public String dash() {
		return "feeCaculation";
	}

	@RequestMapping("/addClass")
	public String das() {
		return "addSubject";
	}

	int studentId;

	@RequestMapping(value = "/calculate", method = RequestMethod.POST)
	public String allstudentList(@ModelAttribute("fee") StudentFee fee, Model model) {
		System.out.println("calculate");
		List<StudentFee> sf = feeRepo.feeCalculation(fee.sid);
		this.studentId = sf.get(0).id;
		System.err.println(sf);
		System.err.println(studentId);
		model.addAttribute("st", sf);
		return "feeCaculation";
	}

	@RequestMapping(value = "/collectFee", method = RequestMethod.POST)
	public String feeCollect(@ModelAttribute("fee") StudentFee fee, Model model) {
		fee.setId(studentId);
		StudentFee sf = feeRepo.findById(studentId).get();
		sf.setCharge(fee.charge);
		int prePaid = sf.getPaid();
		sf.setPaid(fee.fee + prePaid);
		sf.setDui(sf.getDui() - fee.fee);
		int preTotal = sf.getTotal();
		sf.setTotal(fee.fee + fee.charge + preTotal);
		feeRepo.save(sf);
		List<StudentFee> sfFee = feeRepo.feeCalculation(sf.sid);
		model.addAttribute("st", sfFee);
		return "feeCaculation";
	}

	@RequestMapping(value = "/addSubject")
	public String addSubject(@ModelAttribute StudentSubject studentsunbject, Model model) {
		studentSubjectRepository.save(studentsunbject);
		return "redirect:showResult";
	}

	@RequestMapping(value = "/mainPage")
	public String mainPage(Model model) {
		List<Student> studentNameList = studentInterface.findAll();
		System.out.println(studentNameList);
		model.addAttribute("studentname", studentNameList);
		return "addSubjects";
	}

	@RequestMapping(value = "/showResult")
	public String showResult(Model model) {
		List<StudentSubject> studentSubject = studentSubjectRepository.findAll();

		for (int i = 0; i < studentSubject.size(); i++) {
			StudentSubject studentsu = studentSubject.get(i);
			if (studentsu.getBangla() >= 33 && studentsu.getEnglish() >= 33 && studentsu.getMath() >= 33
					&& studentsu.getGeneralScience() >= 33) {
				studentsu.setResult("Pass");
			} else {
				studentsu.setResult("Fail");
			}
			Double math = 0.0;
			if (studentsu.getMath() >= 80) {
				math = 5.0;
			} else if (studentsu.getMath() >= 70) {
				math = 4.0;
			} else if (studentsu.getMath() >= 60) {
				math = 3.50;
			} else if (studentsu.getMath() >= 50) {
				math = 3.00;
			} else if (studentsu.getMath() >= 40) {
				math = 2.00;
			} else {
				math = 1.00;
			}

			Double english = 0.0;
			if (studentsu.getEnglish() >= 80) {
				english = 5.0;
			} else if (studentsu.getEnglish() >= 70) {
				english = 4.0;
			} else if (studentsu.getEnglish() >= 60) {
				english = 3.50;
			} else if (studentsu.getEnglish() >= 50) {
				english = 3.00;
			} else if (studentsu.getEnglish() >= 40) {
				english = 2.00;
			} else {
				english = 1.00;
			}

			Double generalScience = 0.0;
			if (studentsu.getGeneralScience() >= 80) {
				generalScience = 5.0;
			} else if (studentsu.getGeneralScience() >= 70) {
				generalScience = 4.0;
			} else if (studentsu.getGeneralScience() >= 60) {
				generalScience = 3.50;
			} else if (studentsu.getGeneralScience() >= 50) {
				generalScience = 3.00;
			} else if (studentsu.getGeneralScience() >= 40) {
				generalScience = 2.00;
			} else {
				generalScience = 1.00;
			}

			Double bangla = 0.0;
			if (studentsu.getEnglish() >= 80) {
				bangla = 5.0;
			} else if (studentsu.getBangla() >= 70) {
				bangla = 4.0;
			} else if (studentsu.getBangla() >= 60) {
				bangla = 3.50;
			} else if (studentsu.getBangla() >= 50) {
				bangla = 3.00;
			} else if (studentsu.getBangla() >= 40) {
				bangla = 2.00;
			} else {
				bangla = 1.00;
			}

			Double total = (math + english + bangla + generalScience) / 4;

			studentsu.setGpa(total);
			studentSubjectRepository.save(studentsu);
		}

		model.addAttribute("studentSubject", studentSubject);
		return "resultShow";
	}

}
