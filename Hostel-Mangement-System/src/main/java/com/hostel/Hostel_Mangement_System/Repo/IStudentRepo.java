package com.hostel.Hostel_Mangement_System.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.Hostel_Mangement_System.models.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer> {
	//method
	Student findByEmailid(String emailid);

}
