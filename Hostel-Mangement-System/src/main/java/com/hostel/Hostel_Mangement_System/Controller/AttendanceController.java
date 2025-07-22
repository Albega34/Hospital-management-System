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

import com.hostel.Hostel_Mangement_System.Services.IAttendance;
import com.hostel.Hostel_Mangement_System.models.Attendance;

@RestController
@RequestMapping("api/attend/")
public class AttendanceController {
 
	@Autowired
	IAttendance Attend;
	
	@GetMapping(value = "{id}")
	public Attendance getAttendByID(@PathVariable("id")int id)
	{
		return Attend.getAttendById(id);
	}
	//root mapping
	@GetMapping(value = "/")
	public List<Attendance> getAllAttend()
	{
		return Attend.getAllAttend();
	}

	@PostMapping(value = "create")
	public Attendance createAttend(@RequestBody Attendance attendance)
	{
		return Attend.createAttend(attendance);
	}
	@PutMapping(value = "edit")
	public Attendance updateAttend(@RequestBody Attendance attendance)
	{
		return Attend.updateAttend(attendance);
	}
	@DeleteMapping(value = "delete/{id}")
	public String deleteAttend(@PathVariable("id") int id)
	{
		return Attend.deleteAttend(id);
	}
}
