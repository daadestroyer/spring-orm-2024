package com.thecoderstv.springorm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thecoderstv.springorm.entity.Student;
import com.thecoderstv.springorm.service.StudentService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentService studentService = context.getBean("student",StudentService.class);
		
		// save records
		/*
		Student student = new Student();
		student.setId(103);
		student.setName("Suresh Nigam");
		student.setCity("Kanpur");
		
		int saveData = studentService.saveData(student);
		System.out.println("data saved...");
		*/
		
		// delete records
		/*
		Student student = new Student();
		student.setId(103);
		student.setName("Suresh Nigam");
		student.setCity("Kanpur");
		studentService.deleteData(student);
		*/
		
		// update records
//		Student student = new Student();
//		student.setId(101);
//		student.setName("Shubham Nigam");
//		student.setCity("Kanpur");
//		
//		Student updatedStudent = new Student();
//		updatedStudent.setName("Shubham Nigam new");
//		updatedStudent.setCity("Kanpur new");
//		studentService.updateData(student, updatedStudent);
		
		Student student = studentService.getData(101);
		System.out.println(student);
		
		
		System.out.println("------");
		
		List<Student> allData = studentService.getAllData();
		allData.forEach(System.out::println);
	}
}
