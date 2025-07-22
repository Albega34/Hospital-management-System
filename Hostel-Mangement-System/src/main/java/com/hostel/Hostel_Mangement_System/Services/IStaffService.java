package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Staff;

public interface IStaffService {
	
		public Staff createStaff(Staff staff);
	    public Staff updateStaff(Staff staff);
	    public String deleteStaff(int id);
	    public Staff getStaffById(int id);
	    public List<Staff> getAllStaff();
	    
	    //login
	    public Staff getStaffByemailId(String emailid,String password);

}
