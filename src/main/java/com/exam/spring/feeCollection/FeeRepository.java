package com.exam.spring.feeCollection;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeRepository extends JpaRepository<StudentFee, Integer>{

		@Query("SELECT u FROM StudentFee u WHERE u.sid=?1")
		public List<StudentFee> feeCalculation(String sid);
		
		
}
