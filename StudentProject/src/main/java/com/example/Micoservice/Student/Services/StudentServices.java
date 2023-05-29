package com.example.Micoservice.Student.Services;

import java.util.List;

import com.example.Micoservice.Student.Entities.Student;

public interface StudentServices {
 Student addDetails(Student student);
 List< Student> getAll();
 List<Student> getByPercentage();
}
