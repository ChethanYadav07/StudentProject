package com.example.Micoservice.Student.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Micoservice.Student.Entities.Student;
import com.example.Micoservice.Student.Repositories.StudentRepo;
import com.example.Micoservice.Student.Services.StudentServices;

@Service
public class StudentImpl  implements StudentServices{

	@Autowired
	StudentRepo repo;
	@Override
	public Student addDetails(Student student) {
		return repo.save(student);
	}

	@Override
	public List<Student> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Student> getByPercentage() {
		return repo.findByPerc();
	}

}
