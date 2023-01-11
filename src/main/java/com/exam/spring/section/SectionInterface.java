package com.exam.spring.section;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SectionInterface extends JpaRepository<Section, Integer>{
	
}
