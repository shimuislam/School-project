package com.exam.spring.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentResultInterface extends JpaRepository<StudentResult , Integer>{
	
	public StudentResult findBySid(String id);
}
