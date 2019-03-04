package com.restapi.myuniversityapi.exams;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.restapi.myuniversityapi.students.Student;

@Entity 
public class Exam {

	@Id 
	@GeneratedValue (strategy=GenerationType.AUTO )
	private long id;
	private String name;
	
	@ManyToOne
	private Student student;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + ", student=" + student + "]";
	}

	public Exam(long id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}
	public Exam() {
		
	}
	
	
	
}
