package com.exam.spring.classes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exam.spring.section.Section;
import com.exam.spring.teacher.Teacher;
@Repository
public interface ClassInterface extends JpaRepository<Class, Integer>{
        
	@Query("select c From Teacher c WHERE c.name=:n")
	public List<Teacher> getTeacherName(@Param("n")String name);
	
	@Query("select c From Section c WHERE c.name=:n")
	public List<Section> getSectionName(@Param("n")String name);
	
	public List<Class> findAllByClassno(String aaa);
	
	
	
//	
////	public List<Teacher> findAllName();

	
	
}
