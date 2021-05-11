package com.example.practice04.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.practice04.model.Student;

@Transactional
public class StudentService {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Student> getAllStudents() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Student.class);
		return criteria.list();
	}

	public int saveStudent(Student student) {
		sessionFactory.getCurrentSession().save(student);
		return student.getId();
	}
}
