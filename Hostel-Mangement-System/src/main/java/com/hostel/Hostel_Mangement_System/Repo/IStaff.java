package com.hostel.Hostel_Mangement_System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.Hostel_Mangement_System.models.Staff;

@Repository
public interface IStaff extends JpaRepository<Staff, Integer> {
	//get all methods
	
	Staff findByEmailid(String emailid);

}
