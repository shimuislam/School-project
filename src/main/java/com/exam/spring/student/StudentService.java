package com.exam.spring.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	@Autowired
	private StudentInterface si;
	
	public void addStudent(Student student) {
		si.save(student);
	}
	public void updateStudent(Student student) {
		si.save(student);
	}
	public void deleteStudent(Student student) {
		si.delete(student);
	}
	public List<Student> allStudent() {
		return si.findAll();
	}
	public Student showById(int id) {
		return si.findById(id).get();
	}
}
