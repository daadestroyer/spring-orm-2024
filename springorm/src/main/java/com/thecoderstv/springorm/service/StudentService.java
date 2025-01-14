package com.thecoderstv.springorm.service;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.thecoderstv.springorm.entity.Student;

public class StudentService {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveData(Student student) {
		int res = (Integer) this.hibernateTemplate.save(student);
		return res;
	}

	@Transactional
	public void deleteData(Student student) {
		this.hibernateTemplate.delete(student);
	}

	@Transactional
	public void updateData(Student student, Student updatedStudent) {

		this.hibernateTemplate.update(updatedStudent);

	}

	public Student getData(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}

	public List<Student> getAllData() {
		List<Student> res = this.hibernateTemplate.loadAll(Student.class);
		return res;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentService(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

}
