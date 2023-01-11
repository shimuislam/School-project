package com.exam.spring.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
@Component
public class StudentResult {
	@Id
	@GeneratedValue
	int id;
	String name;
	int bangla;
	int english;
	int math;
	int gk;
	int bgs;
	int total;
	int average;
	String grade;
	String result;
	String sid;
	public StudentResult() {
		super();
	}
	public StudentResult(int id) {
		super();
		this.id = id;
	}
	
	
	
	public StudentResult(int id, String name, int bangla, int english, int math, int gk, int bgs, int total,
			int average, String grade, String result, String sid) {
		super();
		this.id = id;
		this.name = name;
		this.bangla = bangla;
		this.english = english;
		this.math = math;
		this.gk = gk;
		this.bgs = bgs;
		this.total = total;
		this.average = average;
		this.grade = grade;
		this.result = result;
		this.sid = sid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBangla() {
		return bangla;
	}
	public void setBangla(int bangla) {
		this.bangla = bangla;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getgk() {
		return gk;
	}
	public void setgk(int accounting) {
		this.gk = accounting;
	}
	public int getbgs() {
		return bgs;
	}
	public void setbgs(int marketing) {
		this.bgs = marketing;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	@Override
	public String toString() {
		return "StudentResult [id=" + id + ", name=" + name + ", bangla=" + bangla + ", english=" + english + ", math="
				+ math + ", gk=" + gk + ", bgs=" + bgs + ", total=" + total + ", average="
				+ average + ", grade=" + grade + ", result=" + result + ", sid=" + sid + "]";
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
}
