package com.hostel.Hostel_Mangement_System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.Hostel_Mangement_System.models.Bad_Report;

@Repository
public interface IBad_ReportRepo extends JpaRepository<Bad_Report, Integer> {
	//method all

}
