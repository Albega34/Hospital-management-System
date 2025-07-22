package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IStaff;
import com.hostel.Hostel_Mangement_System.models.Staff;

@Service
public class StaffService implements IStaffService {
	@Autowired
	IStaff StaffRepo;

	@Override
	public Staff createStaff(Staff staff) {
		// TODO Auto-generated method stub
		return StaffRepo.save(staff);
	}

	@Override
	public Staff updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		return StaffRepo.save(staff);
	}

	@Override
	public String deleteStaff(int id) {
		// TODO Auto-generated method stub
	      Optional<Staff> staff = StaffRepo.findById(id);
	        if(staff.isPresent()) {
	            Staff staffEntity = staff.get();
	            StaffRepo.delete(staffEntity);
	            return "Staff is deleted Successfully";
	        }
	        return "Staff with "+id+" not found";
	}

	@Override
	public Staff getStaffById(int id) {
		// TODO Auto-generated method stub
	    Optional<Staff> optionalStaff = StaffRepo.findById(id);
        return (Staff)optionalStaff.get();
	}

	@Override
	public List<Staff> getAllStaff() {
		// TODO Auto-generated method stub
		return StaffRepo.findAll();
	}

	@Override
	public Staff getStaffByemailId(String emailid, String password) {
		// TODO Auto-generated method stub
		Staff staff=StaffRepo.findByEmailid(emailid);
		if(staff!=null)
		{
			//check the password
			if(staff.getPassword().equals(password))
			{
				return staff;
				
			}
			else
			{
				staff=null;
			}
			
		}
		return staff;
	}

}
