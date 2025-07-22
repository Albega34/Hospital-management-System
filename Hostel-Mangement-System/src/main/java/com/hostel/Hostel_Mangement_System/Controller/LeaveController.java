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
import org.springframework.web.bind.annotation.RestController;

import com.hostel.Hostel_Mangement_System.Services.ILeaveService;
import com.hostel.Hostel_Mangement_System.models.Leave;

@RestController
@RequestMapping("api/leave/")
public class LeaveController {
	@Autowired
	ILeaveService Leaveservice;
	
	@GetMapping(value = "{id}")
	public Leave getLeaveByID(@PathVariable("id")int id)
	{
		return Leaveservice.getLeavebyId(id);
	}
	//root mapping
	@GetMapping(value = "/")
	public List<Leave> getAllLeave()
	{
		return Leaveservice.getAllLeave();
	}

	@PostMapping(value = "create")
	public Leave createLeave(@RequestBody Leave leave)
	{
		return Leaveservice.createLeave(leave);
	}
	@PutMapping(value = "edit")
	public Leave updateLeave(@RequestBody Leave leave)
	{
		return Leaveservice.updateLeave(leave);
	}
	@DeleteMapping(value = "delete/{id}")
	public String deleteLeave(@PathVariable("id") int id)
	{
		return Leaveservice.deleteLeave(id);
	}
}
