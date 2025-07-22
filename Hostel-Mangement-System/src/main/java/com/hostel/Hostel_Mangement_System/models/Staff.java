package com.hostel.Hostel_Mangement_System.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Staff_Table")
public class Staff {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "staff_id")
	    private int staff_id;

	    @Column(name = "name", length = 40, nullable = false)
	    private String name;

	    @Column(name = "role", length = 40, nullable = false)
	    private String role;

	    @Column(name = "contact_no", length = 40, nullable = false, unique = true)
	    private String contact_no;

	    @Column(name = "emailid", length = 80, nullable = false)
	    private String emailid;
	    
	    @Column(name = "password", length = 80, nullable = false)
	    private String password;

	    public Staff() {
	    }

	    
	    
		public Staff(String name, String role, String contact_no, String emailid, String password) {
			super();
			this.name = name;
			this.role = role;
			this.contact_no = contact_no;
			this.emailid = emailid;
			this.password = password;
		}



		public int getStaff_id() {
			return staff_id;
		}

		public void setStaff_id(int staff_id) {
			this.staff_id = staff_id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getContact_no() {
			return contact_no;
		}

		public void setContact_no(String contact_no) {
			this.contact_no = contact_no;
		}

		public String getEmailid() {
			return emailid;
		}

		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	    
	    
	    
}
