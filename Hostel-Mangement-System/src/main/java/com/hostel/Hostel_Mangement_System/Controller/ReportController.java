package com.hostel.Hostel_Mangement_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hostel.Hostel_Mangement_System.Services.IReportService;
import com.hostel.Hostel_Mangement_System.models.Report;

@RestController
@RequestMapping("api/report/")
public class ReportController {
	@Autowired
	IReportService Reportservice;
	
	@GetMapping(value = "{id}")
	public Report getReportByID(@PathVariable("id")int id)
	{
		return Reportservice.getReportbyId(id);
	}
	//root mapping
	@GetMapping(value = "/")
	public List<Report> getAllReport()
	{
		return Reportservice.getAllReport();
	}

	@PostMapping(value = "create")
	public Report createReport(@RequestBody Report report)
	{
		return Reportservice.createLeave(report);
	}
	@PutMapping(value = "edit")
	public Report updateReport(@RequestBody Report report)
	{
		return Reportservice.updateLeave(report);
	}
	@DeleteMapping(value = "delete/{id}")
	public String deleteReport(@PathVariable("id") int id)
	{
		return Reportservice.deleteReport(id);
	}

}
