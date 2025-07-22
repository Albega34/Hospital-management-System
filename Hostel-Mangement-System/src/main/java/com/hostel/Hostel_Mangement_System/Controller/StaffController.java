package com.hostel.Hostel_Mangement_System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hostel.Hostel_Mangement_System.Services.IStaffService;
import com.hostel.Hostel_Mangement_System.models.Staff;

@RestController
@RequestMapping("api/staff/")
public class StaffController {
	
	@Autowired
	IStaffService staffService;
	
	  @GetMapping(value = "{id}")
	    public Staff getStaffById(@PathVariable("id") int id) {
	        return staffService.getStaffById(id);
	    }

	    @GetMapping(value = "/")
	    public List<Staff> getAllStaff() {
	        return staffService.getAllStaff();
	    }

	    @PostMapping(value = "create")
	    public Staff createStaff(@RequestBody Staff staff) {
	        return staffService.createStaff(staff);
	    }

	    @PutMapping(value = "edit")
	    public Staff updateStaff(@RequestBody Staff staff) {
	        return staffService.updateStaff(staff);
	    }

	    @DeleteMapping(value = "delete/{id}")
	    public String deleteStaff(@PathVariable("id") int id) {
	        return staffService.deleteStaff(id);
	    }

		@PostMapping(value="login")
		public Staff staffLogin(@RequestParam("emailid") String emailid,
				@RequestParam("password") String password)
		{
			return staffService.getStaffByemailId(emailid, password);
		}
}
