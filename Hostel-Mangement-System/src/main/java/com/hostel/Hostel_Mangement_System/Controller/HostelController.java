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

import com.hostel.Hostel_Mangement_System.Services.IHostelService;
import com.hostel.Hostel_Mangement_System.models.Hostel;

@RestController
@RequestMapping("api/hostel/")
public class HostelController {
	@Autowired
	IHostelService Hostelservice;
	
	@GetMapping(value = "{id}")
	public Hostel getHostelByID(@PathVariable("id")int id)
	{
		return Hostelservice.getHostelbyId(id);
	}
	//root mapping
	@GetMapping(value = "/")
	public List<Hostel> getAllHostel()
	{
		return Hostelservice.getAllHostel();
	}

	@PostMapping(value = "create")
	public Hostel createHostel(@RequestBody Hostel hostel)
	{
		return Hostelservice.createHostel(hostel);
	}
	@PutMapping(value = "edit")
	public Hostel updateHostel(@RequestBody Hostel hostel)
	{
		return Hostelservice.updateHostel(hostel);
	}
	@DeleteMapping(value = "delete/{id}")
	public String deleteHostel(@PathVariable("id") int id)
	{
		return Hostelservice.deleteHostel(id);
	}
}
