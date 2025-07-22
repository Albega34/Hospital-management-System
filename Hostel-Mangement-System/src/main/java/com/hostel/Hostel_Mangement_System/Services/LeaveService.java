package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.ILeaveRepo;
import com.hostel.Hostel_Mangement_System.models.Leave;

@Service
public class LeaveService implements ILeaveService{
	
	@Autowired
	ILeaveRepo LeaveRepo;

	@Override
	public Leave createLeave(Leave leave) {
		// TODO Auto-generated method stub
		return LeaveRepo.save(leave);
	}

	@Override
	public Leave updateLeave(Leave leave) {
		// TODO Auto-generated method stub
		return LeaveRepo.save(leave);
	}

	@Override
	public String deleteLeave(int id) {
		// TODO Auto-generated method stub
	     Optional<Leave> leave=LeaveRepo.findById(id);
	     //check the object id there or not
	     if(leave.isPresent())
	     {
	    	 Leave lea=leave.get();
	    	 //delete
	    	 LeaveRepo.delete(lea);
	    	 return "leave is deleted";
	     }
	     return "leave with "+id+" notfound";
	}

	@Override
	public Leave getLeavebyId(int id) {
		// TODO Auto-generated method stub
		Optional<Leave> optionLeave=LeaveRepo.findById(id);
		return (Leave)optionLeave.get();
	}

	@Override
	public List<Leave> getAllLeave() {
		// TODO Auto-generated method stub
		return LeaveRepo.findAll();
	}

}
