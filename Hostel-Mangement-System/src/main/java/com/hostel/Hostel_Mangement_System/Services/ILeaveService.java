package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Leave;

public interface ILeaveService {
	public Leave createLeave(Leave leave);
	public Leave updateLeave(Leave leave);
	public String deleteLeave(int id);
	public Leave getLeavebyId(int id);
	public List<Leave> getAllLeave();

}
