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
@Table(name="Attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="date",length=40,nullable = false,unique = true)
	private String date;
	@Column(name="status",length=40,nullable = false,unique = true)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	Student student;
	
	public Attendance() {
		
	}

	public Attendance(String date, String status, Student student) {
		super();
		this.date = date;
		this.status = status;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", date=" + date + ", status=" + status + ", student=" + student + "]";
	}
	
	
	
}
