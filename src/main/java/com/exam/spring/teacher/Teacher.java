package com.exam.spring.teacher;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Teacher {
	 @Id
     @GeneratedValue
	     int id;
	     String name;
         String email;
         String dateofbirth;
         String designation;
         String gender;
         String religion;
         String address;
         String jdate;
         String phone;
         String photo;
		public Teacher() {
			
		}
		public Teacher(int id) {
			super();
			this.id = id;
		}
		
		public Teacher(String name, String email, String dateofbirth, String designation, String gender,
				String religion, String address, String jdate, String phone, String photo) {
			super();
			this.name = name;
			this.email = email;
			this.dateofbirth = dateofbirth;
			this.designation = designation;
			this.gender = gender;
			this.religion = religion;
			this.address = address;
			this.jdate = jdate;
			this.phone = phone;
			this.photo = photo;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDateofbirth() {
			return dateofbirth;
		}
		public void setDateofbirth(String dateofbirth) {
			this.dateofbirth = dateofbirth;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getReligion() {
			return religion;
		}
		public void setReligion(String religion) {
			this.religion = religion;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getJdate() {
			return jdate;
		}
		public void setJdate(String jdate) {
			this.jdate = jdate;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		@Override
		public String toString() {
			return "Teacher [id=" + id + ", name=" + name + ", email=" + email + ", dateofbirth=" + dateofbirth
					+ ", designation=" + designation + ", gender=" + gender + ", religion=" + religion + ", address="
					+ address + ", jdate=" + jdate + ", phone=" + phone + ", photo=" + photo + "]";
		}
		
	     
		   
	    
	   

	 
	   

}
