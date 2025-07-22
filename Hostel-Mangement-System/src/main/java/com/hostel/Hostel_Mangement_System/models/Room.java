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
@Table(name="Room")

public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="room_id")
	private int room_id;
	@Column(name="room_no",length=40,nullable = false,unique = true)
	private String room_no;
	@Column(name="type",length=40,nullable = false,unique = true)
	private String type;
	@Column(name="capacity",length=40,nullable = false,unique = true)
	private int capacity;
	@Column(name="status",length=40,nullable = false,unique = true)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="hostel_id")
	Hostel hostel;
	
	public Room() {
		
	}

	

	public Room(String room_no, String type, int capacity, String status, Hostel hostel) {
		super();
		this.room_no = room_no;
		this.type = type;
		this.capacity = capacity;
		this.status = status;
		this.hostel = hostel;
	}



	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getRoom_no() {
		return room_no;
	}

	public void setRoom_no(String room_no) {
		this.room_no = room_no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Hostel getHostel() {
		return hostel;
	}

	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
	
	



	



}
