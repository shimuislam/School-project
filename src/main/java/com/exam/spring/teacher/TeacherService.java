package com.exam.spring.teacher;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
	@Autowired
        private TeacherInterface ti;
	
	public void addTeacher(Teacher teacher) {
		ti.save(teacher);
	}
	public void updateTeacher(Teacher teacher) {
		ti.save(teacher);
	}
	public void deleteTeacher(Teacher teacher) {
		ti.delete(teacher);
	}
	public List<Teacher> showteacher(){
		return ti.findAll();
	}
	public Teacher showById(int id) {
		return ti.findById(id).get();
	}
	                                                
	  
}
