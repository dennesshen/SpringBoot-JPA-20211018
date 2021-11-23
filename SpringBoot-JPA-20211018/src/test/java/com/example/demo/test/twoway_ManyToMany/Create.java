package com.example.demo.test.twoway_ManyToMany;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.twoway.ManyToMany.Course;
import com.example.demo.entity.twoway.ManyToMany.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;

@SpringBootTest
public class Create {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Test
	public void begin() {
		System.out.println("Create");
		Course course1 = new Course();
		course1.setName("Java");
		
		Course course2 = new Course();
		course2.setName("Python");
		
		Student student1 = new Student();
		student1.setName("Mary");
		
		Student student2 = new Student();
		student2.setName("John");
		
		//設置關聯關係
		course1.getStudents().add(student1);
		course2.getStudents().add(student2);
		student1.getCourses().add(course1);
		student2.getCourses().add(course2);
		
		//執行預設保存
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		courseRepository.save(course1);
//		courseRepository.save(course2);
		
		//關聯保存
		courseRepository.save(course1);
		courseRepository.save(course2);
		
		
	}

}
