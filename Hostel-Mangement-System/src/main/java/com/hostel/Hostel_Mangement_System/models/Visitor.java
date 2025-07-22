package com.hostel.Hostel_Mangement_System.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Visitor")
public class Visitor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="visitor_id")
	private int visitor_id;
	
	@Column(name="name",length=40,nullable = false,unique = true)
	private String name;
	
	@Column(name="relation",length=40,nullable = false,unique = true)
	private String relation;
	
	@Column(name="file",length=40,nullable = false,unique = true)
	private String file;
	
	@Column(name="time",length=40,nullable = false,unique = true)
	private String time;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	Student student;
	
	public Visitor() {
		
	}

	public Visitor(String name, String relation, String file, String time, Student student) {
		super();
		this.name = name;
		this.relation = relation;
		this.file = file;
		this.time = time;
		this.student = student;
	}

	public int getVisitor_id() {
		return visitor_id;
	}

	public void setVisitor_id(int visitor_id) {
		this.visitor_id = visitor_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Visitor [visitor_id=" + visitor_id + ", name=" + name + ", relation=" + relation + ", file=" + file
				+ ", time=" + time + ", student=" + student + "]";
	}
	
	
	

}
