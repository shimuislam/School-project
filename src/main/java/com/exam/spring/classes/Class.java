package com.exam.spring.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Class {
	@Id
	@GeneratedValue
     int id;
     String classno;
     String teachername;
     String section;
	public Class() {
		
	}
	public Class(int id) {
		super();
		this.id = id;
	}
	public Class(String classno, String teachername, String section) {
		super();
		this.classno = classno;
		this.teachername = teachername;
		this.section = section;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassno() {
		return classno;
	}
	public void setClassno(String classno) {
		this.classno = classno;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", classno=" + classno + ", teachername=" + teachername + ", section=" + section
				+ "]";
	}
     
     
}
