package com.hostel.Hostel_Mangement_System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.Hostel_Mangement_System.models.Equipment;

@Repository
public interface IEquipmentRepo extends JpaRepository<Equipment, Integer> {
	//here you get all

}
