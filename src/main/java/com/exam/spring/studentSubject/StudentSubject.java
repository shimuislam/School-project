package com.exam.spring.studentSubject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentSubject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	String studentName;
	String classna;
	Integer bangla;
	Integer english;
	Integer math;
	Integer generalScience;
	String result;
	Double gpa;

	public StudentSubject() {
	}

	public StudentSubject(Integer id, String studentName, String classna, Integer bangla, Integer english, Integer math,
			Integer generalScience, String result, Double gpa) {
		this.id = id;
		this.studentName = studentName;
		this.classna = classna;
		this.bangla = bangla;
		this.english = english;
		this.math = math;
		this.generalScience = generalScience;
		this.result = result;
		this.gpa = gpa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassna() {
		return classna;
	}

	public void setClassna(String classna) {
		this.classna = classna;
	}

	public Integer getBangla() {
		return bangla;
	}

	public void setBangla(Integer bangla) {
		this.bangla = bangla;
	}

	public Integer getEnglish() {
		return english;
	}

	public void setEnglish(Integer english) {
		this.english = english;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getGeneralScience() {
		return generalScience;
	}

	public void setGeneralScience(Integer generalScience) {
		this.generalScience = generalScience;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "StudentSubject [id=" + id + ", studentName=" + studentName + ", classna=" + classna + ", bangla=" + bangla
				+ ", english=" + english + ", math=" + math + ", generalScience=" + generalScience + ", result=" + result
				+ ", gpa=" + gpa + "]";
	}

}
