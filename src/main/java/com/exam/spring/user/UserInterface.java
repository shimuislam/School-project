package com.exam.spring.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserInterface extends JpaRepository<User, Integer>{
//	@Query("select u form user WHERE u.name=:n")
//	public List<User> getUserbyName(@Param("n")String name);
}
