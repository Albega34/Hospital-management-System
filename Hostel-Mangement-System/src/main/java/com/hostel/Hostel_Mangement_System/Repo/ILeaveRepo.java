package com.hostel.Hostel_Mangement_System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.Hostel_Mangement_System.models.Leave;

@Repository
public interface ILeaveRepo extends JpaRepository<Leave, Integer>{
	//all methods

}
