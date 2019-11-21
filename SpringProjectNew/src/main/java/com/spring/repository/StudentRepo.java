package com.spring.repository;    //interface

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.StudentBean.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {   //bean class and primary key type
	
	List<Student> findByName(String name); //fun for find by name 
	
	List<Student> findByIdBetween(Integer start,Integer end); //fun for find id btw
	
	
	
	
	
	// @Query("select u from user u where u.email=?");   // class
	// Student findByMail("String mail");
}
