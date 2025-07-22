package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IBad_ReportRepo;
import com.hostel.Hostel_Mangement_System.models.Bad_Report;

@Service
public class Bad_ReportService implements IBad_ReportService {
	
	@Autowired
	IBad_ReportRepo BadRepo;

	@Override
	public Bad_Report createBadReport(Bad_Report badReport) {
	    return BadRepo.save(badReport);
	}
	
	@Override
	public Bad_Report updateBadReport(Bad_Report badReport) {
		// TODO Auto-generated method stub
		return BadRepo.save(badReport);
	}

	@Override
	public String deleteBadReport(int id) {
		// TODO Auto-generated method stub
	    Optional<Bad_Report> badReport = BadRepo.findById(id);
	    
	    if (badReport.isPresent()) {
	        Bad_Report report = badReport.get();
	        BadRepo.delete(report);
	        return "Bad report deleted successfully";
	    }
	    return "Bad report with ID " + id + " not found";
	}

	@Override
	public Bad_Report getBadReportById(int id) {
		// TODO Auto-generated method stub
		 Optional<Bad_Report> optionalBadReport = BadRepo.findById(id);
		    return (Bad_Report)optionalBadReport.get();
	}

	@Override
	public List<Bad_Report> getAllBadReports() {
		// TODO Auto-generated method stub
		return BadRepo.findAll();
	}

}
