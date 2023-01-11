package com.exam.spring.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Student {
		@Id
		@GeneratedValue
	    int id;
		String name;
		String date;
		String gender;
		String bloodgroup;
		String religeon;
		String email;
		String phone;
		String address;
		String sid;
		String classes;
		
		public Student() {
			super();
		}

		public Student(int id) {
			super();
			this.id = id;
		}

		public Student(String name, String date, String gender, String bloodgroup, String religeon, String email,
				String phone, String address, String classes) {
			super();
			this.name = name;
			this.date = date;
			this.gender = gender;
			this.bloodgroup = bloodgroup;
			this.religeon = religeon;
			this.email = email;
			this.phone = phone;
			this.address = address;
			this.classes =classes;
		}

		public Student(int id, String name, String date, String gender, String bloodgroup, String religeon,
				String email, String phone, String address, String sid, String classes) {
			super();
			this.id = id;
			this.name = name;
			this.date = date;
			this.gender = gender;
			this.bloodgroup = bloodgroup;
			this.religeon = religeon;
			this.email = email;
			this.phone = phone;
			this.address = address;
			this.sid=sid;
			this.classes = classes;
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

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getBloodgroup() {
			return bloodgroup;
		}

		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}

		public String getReligeon() {
			return religeon;
		}

		public void setReligeon(String religeon) {
			this.religeon = religeon;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", date=" + date + ", gender=" + gender + ", bloodgroup="
					+ bloodgroup + ", religeon=" + religeon + ", email=" + email + ", phone=" + phone + ", address="
					+ address + "]";
		}

		public String getSid() {
			return sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getClasses() {
			return classes;
		}

		public void setClasses(String classes) {
			this.classes = classes;
		}
		
		
		
		
		
}
