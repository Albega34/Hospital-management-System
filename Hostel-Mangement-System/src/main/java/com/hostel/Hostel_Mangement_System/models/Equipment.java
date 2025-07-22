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
@Table(name="Equipment")
public class Equipment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="equip_name",length=40,nullable = false,unique = true)
	private String equip_name;
	@Column(name="quantity")
	private int quantity;
	@Column(name="description",length=40,nullable = false,unique = true)
	private String description;
	@Column(name="date",length=40,nullable = false,unique = true)
	private String date;
	

	@ManyToOne
	@JoinColumn(name="staff_id")
	Staff staff;
	
	public Equipment() {
		
	}

	public Equipment(String equip_name, int quantity, String description, String date, Staff staff) {
		super();
		this.equip_name = equip_name;
		this.quantity = quantity;
		this.description = description;
		this.date = date;
		this.staff = staff;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEquip_name() {
		return equip_name;
	}

	public void setEquip_name(String equip_name) {
		this.equip_name = equip_name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	
	
}
