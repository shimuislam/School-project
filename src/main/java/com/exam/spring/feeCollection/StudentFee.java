package com.exam.spring.feeCollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StudentFee {
	@Id
	@GeneratedValue
	int id;
	String name;
	String classes;
	String section;
	String month;
	String date;
	int dui;
	int charge;
	int latefee;
	int total;
	String sid;
	int fee;
	int paid;
	
	public StudentFee(int id, String name, String classes, String section, String month, String date, int dui,
			int charge, int latefee, int total, String sid, int fee, int paid) {
		super();
		this.id = id;
		this.name = name;
		this.classes = classes;
		this.section = section;
		this.month = month;
		this.date = date;
		this.dui = dui;
		this.charge = charge;
		this.latefee = latefee;
		this.total = total;
		this.sid = sid;
		this.fee = fee;
		this.paid = paid;
	}

	public StudentFee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
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

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDui() {
		return dui;
	}

	public void setDui(int dui) {
		this.dui = dui;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public int getLatefee() {
		return latefee;
	}

	public void setLatefee(int latefee) {
		this.latefee = latefee;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}
	
	

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "StudentFee [id=" + id + ", name=" + name + ", classes=" + classes + ", section=" + section + ", month="
				+ month + ", date=" + date + ", dui=" + dui + ", charge=" + charge + ", latefee=" + latefee + ", total="
				+ total + "]";
	}
	
	
	
	

}
