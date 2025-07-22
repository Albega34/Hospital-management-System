package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IReportRepo;
import com.hostel.Hostel_Mangement_System.models.Report;

@Service
public class ReportService implements IReportService {
	
	@Autowired
	IReportRepo ReportRepo;

	@Override
	public Report createLeave(Report report) {
		// TODO Auto-generated method stub
		return ReportRepo.save(report);
	}

	@Override
	public Report updateLeave(Report report) {
		// TODO Auto-generated method stub
		return ReportRepo.save(report);
	}

	@Override
	public String deleteReport(int id) {
		// TODO Auto-generated method stub
		Optional<Report> report=ReportRepo.findById(id);
		//check report is there or not
		if(report.isPresent())
		{
			Report rep=report.get();
			//delete
			ReportRepo.delete(rep);
			return "report deleted succesfully";
		}
		return "report with"+id+"not found";
	}

	@Override
	public Report getReportbyId(int id) {
		// TODO Auto-generated method stub
		Optional<Report> report=ReportRepo.findById(id);
        return (Report)report.get();
	}

	@Override
	public List<Report> getAllReport() {
		// TODO Auto-generated method stub
		return ReportRepo.findAll();
	}

}
