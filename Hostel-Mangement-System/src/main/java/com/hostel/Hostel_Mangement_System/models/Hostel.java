package com.hostel.Hostel_Mangement_System.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Hostel")

public class Hostel {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="hostel_id")
		private int hostel_id;
		@Column(name="name",length=40,nullable = false,unique = true)
		private String name;
		@Column(name="address",length=80,nullable = false,unique = true)
		private String address;
		@Column(name="warden_name",length=40,nullable = false,unique = true)
		private String warden_name;
		@Column(name="contact_no",length=40,nullable = false,unique = true)
		private String contact_no;
		
		public Hostel() {
			
		}

		public Hostel(String name, String address, String warden_name, String contact_no) {
			super();
			this.name = name;
			this.address = address;
			this.warden_name = warden_name;
			this.contact_no = contact_no;
		}

		public int getHostel_id() {
			return hostel_id;
		}

		public void setHostel_id(int hostel_id) {
			this.hostel_id = hostel_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getWarden_name() {
			return warden_name;
		}

		public void setWarden_name(String warden_name) {
			this.warden_name = warden_name;
		}

		public String getContact_no() {
			return contact_no;
		}

		public void setContact_no(String contact_no) {
			this.contact_no = contact_no;
		}

		@Override
		public String toString() {
			return "Hostel [hostel_id=" + hostel_id + ", name=" + name + ", address=" + address + ", warden_name="
					+ warden_name + ", contact_no=" + contact_no + "]";
		}


		
		
		

		

		

	}


