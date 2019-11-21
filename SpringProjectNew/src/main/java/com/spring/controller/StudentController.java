package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.StudentBean.Student;
import com.spring.repository.StudentRepo;



@Controller
public class StudentController {
	
		
	@Autowired                       //dependency injection
	private StudentRepo repo;
	

		@GetMapping("/index")   //      use   /index    in  url: http://localhost:8585/
		public String showHomePage() {
			return "index";
		}
		
		
		@PostMapping("/insertAction")                        //      come here when call insertAction from form        in  url: http://localhost:8585/
		public String StudentBean(Student sb,Model model){
			System.out.println(sb.getName());
			model.addAttribute("sb",sb);
			
			repo.save(sb);
			
			return "success";
		}
		
		@GetMapping("/view")   //      use   /view    in  url: http://localhost:8585/		
		public String getStudents(Model model){
			List<Student> studentList=new ArrayList<Student>();
			
			studentList=repo.findAll();  //to find all value
			//studentList=repo.findByName("shambu");   // to find by name
			
			model.addAttribute("studentList",studentList);
			return "allStudents";
			
			
		}
		
	}
