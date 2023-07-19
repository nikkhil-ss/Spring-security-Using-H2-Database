package com.example.demo.model;





import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Student {
	
	@jakarta.persistence.Id
	private Long id;
	private String student_name;
	private int maths_marks;
	private int science_marks;
	private int history_marks;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public int getMaths_marks() {
		return maths_marks;
	}
	public void setMaths_marks(int maths_marks) {
		this.maths_marks = maths_marks;
	}
	public int getScience_marks() {
		return science_marks;
	}
	public void setScience_marks(int science_marks) {
		this.science_marks = science_marks;
	}
	public int getHistory_marks() {
		return history_marks;
	}
	public void setHistory_marks(int history_marks) {
		this.history_marks = history_marks;
	}
	public Student(Long id, String student_name, int maths_marks, int science_marks, int history_marks) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.maths_marks = maths_marks;
		this.science_marks = science_marks;
		this.history_marks = history_marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
