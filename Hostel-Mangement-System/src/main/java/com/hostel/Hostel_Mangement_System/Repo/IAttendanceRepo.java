package com.hostel.Hostel_Mangement_System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.Hostel_Mangement_System.models.Attendance;

@Repository

public interface IAttendanceRepo extends JpaRepository<Attendance, Integer>{
	//method

}
