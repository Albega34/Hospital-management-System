package com.hostel.Hostel_Mangement_System.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bad_Report")
public class Bad_Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description", length = 800, nullable = false)
    private String description;

    @Column(name = "report_date", length = 40, nullable = false)
    private String report_date;

    @Column(name = "hostel_name", nullable = false)
    private String hostel_name;

    public Bad_Report() {
    }

	public Bad_Report(String description, String report_date, String hostel_name) {
		super();
		this.description = description;
		this.report_date = report_date;
		this.hostel_name = hostel_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReport_date() {
		return report_date;
	}

	public void setReport_date(String report_date) {
		this.report_date = report_date;
	}

	public String getHostel_name() {
		return hostel_name;
	}

	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}

	@Override
	public String toString() {
		return "Bad_Report [id=" + id + ", description=" + description + ", report_date=" + report_date
				+ ", hostel_name=" + hostel_name + "]";
	}
    
    
    
}