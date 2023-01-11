package com.exam.spring.section;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Section {
	@Id
	@GeneratedValue
	int secid;
	String section;
	String classno;
	String name;

	public Section() {

	}

	public Section(int secid) {
		super();
		this.secid = secid;
	}

	public Section(String section, String classno, String name) {
		super();
		this.section = section;
		this.classno = classno;
		this.name = name;
	}

	public Section(int secid, String section, String classno, String name) {
		super();
		this.secid = secid;
		this.section = section;
		this.classno = classno;
		this.name = name;
	}

	public int getSecid() {
		return secid;
	}

	public void setSecid(int secid) {
		this.secid = secid;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getClassno() {
		return classno;
	}

	public void setClassno(String classno) {
		this.classno = classno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Section [secid=" + secid + ", section=" + section + ", classno=" + classno + ", name=" + name + "]";
	}

	

}
