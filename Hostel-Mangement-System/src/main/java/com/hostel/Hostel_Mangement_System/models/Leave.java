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
@Table(name="Leave_table")
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="from_date",length=40,nullable = false,unique = true)
	private String from_date;
	
	@Column(name="to_date",length=40,nullable = false,unique = true)
	private String to_date;
	
	@Column(name="reason",length=40,nullable = false,unique = true)
	private String reason;
	
	@Column(name="status",length=40,nullable = false,unique = true)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	Student student;
	
	public Leave() {
		
	}

	public Leave(String from_date, String to_date, String reason, String status, Student student) {
		super();
		this.from_date = from_date;
		this.to_date = to_date;
		this.reason = reason;
		this.status = status;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom_date() {
		return from_date;
	}

	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}

	public String getTo_date() {
		return to_date;
	}

	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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
		return "Leave [id=" + id + ", from_date=" + from_date + ", to_date=" + to_date + ", reason=" + reason
				+ ", status=" + status + ", student=" + student + "]";
	}
	
	
}
