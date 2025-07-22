package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Bad_Report;

public interface IBad_ReportService {
	public Bad_Report createBadReport(Bad_Report badReport);
	public Bad_Report updateBadReport(Bad_Report badReport);
	public String deleteBadReport(int id);
	public Bad_Report getBadReportById(int id);
	public List<Bad_Report> getAllBadReports();

}
