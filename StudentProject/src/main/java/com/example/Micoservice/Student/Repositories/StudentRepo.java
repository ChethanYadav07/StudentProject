package com.example.Micoservice.Student.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Micoservice.Student.Entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{
 
	//@Query(value="select f_name,java,english,maths,science,((english+java+maths+science)/400)*100 as perc from student where ((english+java+maths+science)/400)*100>60; ",nativeQuery=true)
   @Query(value="select * from student where ((english+java+science+maths)/400)*100>60",nativeQuery=true)
	List<Student> findByPerc();
}
