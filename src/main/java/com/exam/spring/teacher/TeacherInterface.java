package com.exam.spring.teacher;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherInterface extends JpaRepository<Teacher, Integer>{
//	@Autowired
//	public List<Teacher> findAllName();
	
	
}
