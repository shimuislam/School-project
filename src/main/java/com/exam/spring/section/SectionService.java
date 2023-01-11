package com.exam.spring.section;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService {
	@Autowired
	private SectionInterface seci;
	
	public void addSection(Section section) {
		 seci.save(section);
	}
	public void updateSection(Section section) {
		 seci.save(section);
	}
	public void deleteSection(Section section) {
		 seci.delete(section);
	}
	public List<Section> showSection(){
		return seci.findAll();
	}

}
