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

import com.hostel.Hostel_Mangement_System.Services.IBad_ReportService;
import com.hostel.Hostel_Mangement_System.models.Bad_Report;

@RestController
@RequestMapping("api/bad/")
public class Bad_ReportController {
	@Autowired
	IBad_ReportService BadService;
	
	@GetMapping(value = "{id}")
	public Bad_Report getBadReportById(@PathVariable("id") int id) {
	    return BadService.getBadReportById(id);
	}

	@GetMapping(value = "/")
	public List<Bad_Report> getAllBadReports() {
	    return BadService.getAllBadReports();
	}

	@PostMapping(value = "create")
	public Bad_Report createBadReport(@RequestBody Bad_Report badReport) {
	    return BadService.createBadReport(badReport);
	}

	@PutMapping(value = "edit")
	public Bad_Report updateBadReport(@RequestBody Bad_Report badReport) {
	    return BadService.updateBadReport(badReport);
	}

	@DeleteMapping(value = "delete/{id}")
	public String deleteBadReport(@PathVariable("id") int id) {
	    return BadService.deleteBadReport(id);
	}

}
