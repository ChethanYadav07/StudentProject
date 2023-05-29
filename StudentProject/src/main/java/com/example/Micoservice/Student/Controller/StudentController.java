package com.example.Micoservice.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Micoservice.Student.Entities.Student;
import com.example.Micoservice.Student.ServiceImplementation.StudentImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentImpl impl;
	
	@RequestMapping("/addstudent")
	String addStudent()
	{
		return "StudentForm.jsp";
	}
	
	@RequestMapping("/savestudent")
	Student saveStudent(Student student)
	{
		return impl.addDetails(student);
	}
	
	@RequestMapping("/findstudent")
	String findstudent()
	{
		return "findstudent.jsp";
	}
	
	@RequestMapping("/studentdetails")
	List<Student> findBypercentage()
	{
		List<Student> s1=impl.getByPercentage();
		System.out.println(s1);
		return s1;
	}
}
