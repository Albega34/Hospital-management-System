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
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="student_id")
	private int student_id;
	
	@Column(name="name",length=40,nullable = false,unique = true)
	private String name;
	
	@Column(name="emailid",length=40,nullable = false,unique = true)
	private String emailid;
	
	@Column(name="contact_no",length=40,nullable = false,unique = true)
	private String contact_no;
	
	@Column(name="admision_date",length=40,nullable = false,unique = true)
	private String admision_date;
	
	@Column(name="password",length=40,nullable = false,unique = true)
	private String password;
	
	@Column(name="file",length=40,nullable = false,unique = true)
	private String file;
	
	@Column(name="status",length=40,nullable = false,unique = true)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="room_id")
	Room room;
	
	public Student() {
		
	}

	public Student(String name, String emailid, String contact_no, String admision_date, String password, String file,
			String status, Room room) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.contact_no = contact_no;
		this.admision_date = admision_date;
		this.password = password;
		this.file = file;
		this.status = status;
		this.room = room;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getAdmision_date() {
		return admision_date;
	}

	public void setAdmision_date(String admision_date) {
		this.admision_date = admision_date;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", email=" + emailid + ", contact_no="
				+ contact_no + ", admision_date=" + admision_date + ", password=" + password + ", file=" + file
				+ ", status=" + status + ", room=" + room + "]";
	}
	
	
	
	
	

}
