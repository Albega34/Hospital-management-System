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
@Table(name="Report_table")
public class Report {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="report_id")
	private int report_id;
	
	@Column(name="description",length=40,nullable = false,unique = true)
	private String description;
	

	@Column(name="status",length=40,nullable = false,unique = true)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	Student student;
	
	@ManyToOne
	@JoinColumn(name="room_id")
	Room room;
	
	public Report() {
		
	}

	public Report(String description, String status, Student student, Room room) {
		super();
		this.description = description;
		this.status = status;
		this.student = student;
		this.room = room;
	}

	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Report [report_id=" + report_id + ", description=" + description + ", status=" + status + ", student="
				+ student + ", room=" + room + "]";
	}
	
	
	
}
