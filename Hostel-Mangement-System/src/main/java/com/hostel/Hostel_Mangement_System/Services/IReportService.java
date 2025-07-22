package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Report;

public interface IReportService {
	public Report createLeave(Report report);
	public Report updateLeave(Report report);
	public String deleteReport(int id);
	public Report getReportbyId(int id);
	public List<Report> getAllReport();


}
