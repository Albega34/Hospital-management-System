package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IAttendanceRepo;
import com.hostel.Hostel_Mangement_System.models.Attendance;

@Service
public class AttendanceService implements IAttendance {
	

	@Autowired
	IAttendanceRepo AttendanceRepo;
	
	@Override
	public Attendance createAttend(Attendance attendance) {
		// TODO Auto-generated method stub
		return AttendanceRepo.save(attendance);
	}

	@Override
	public Attendance updateAttend(Attendance attendance) {
		// TODO Auto-generated method stub
		return AttendanceRepo.save(attendance);
	}

	@Override
	public String deleteAttend(int id) {
		// TODO Auto-generated method stub
		Optional<Attendance> Attend=AttendanceRepo.findById(id);
		//check the object is ther or not

			if(Attend.isPresent())
			{
				Attendance Att=Attend.get();
				//delete
				AttendanceRepo.delete(Att);
				return "Attendance is deleted Successfully";
			}
			return "Attendance with "+id+" not found";
	}

	@Override
	public Attendance getAttendById(int id) {
		// TODO Auto-generated method stub
	Optional<Attendance> optionalAttendance=AttendanceRepo.findById(id);
		
		return (Attendance)optionalAttendance.get();
	}

	@Override
	public List<Attendance> getAllAttend() {
		// TODO Auto-generated method stub
		return AttendanceRepo.findAll();
	}

}
