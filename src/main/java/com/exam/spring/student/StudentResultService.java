package com.exam.spring.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentResultService {
	@Autowired
   private StudentResultInterface sri;
	
	public void addStudentResult(StudentResult sr) {
		sri.save(sr);
	}
	public void updateStudent(StudentResult sr) {
		sri.save(sr);
	}
	public void deleteStudent(StudentResult sr) {
		sri.delete(sr);
	}
	public List<StudentResult> allStudentResult() {
		return sri.findAll();
	}
	public StudentResult showById(int id) {
		return sri.findById(id).get();
	}
}
