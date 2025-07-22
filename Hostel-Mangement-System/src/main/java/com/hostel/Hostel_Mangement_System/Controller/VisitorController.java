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

import com.hostel.Hostel_Mangement_System.Services.IVisitorService;
import com.hostel.Hostel_Mangement_System.models.Visitor;

@RestController
@RequestMapping("api/visitor/")
public class VisitorController {
	@Autowired
	IVisitorService Visitorservice;
	

	@GetMapping(value = "{id}")
	public Visitor getVisitorByID(@PathVariable("id")int id)
	{
		return Visitorservice.getvisitorbyId(id);
	}
	//root mapping
	@GetMapping(value = "/")
	public List<Visitor> getAllVisitor()
	{
		return Visitorservice.getAllVisitor();
	}

	@PostMapping(value = "create")
	public Visitor createVisitor(@RequestBody Visitor visitor)
	{
		return Visitorservice.createVisitor(visitor);
	}
	@PutMapping(value = "edit")
	public Visitor updateVisitor(@RequestBody Visitor visitor)
	{
		return Visitorservice.updateVisitor(visitor);
	}
	@DeleteMapping(value = "delete/{id}")
	public String deleteVisitor(@PathVariable("id") int id)
	{
		return Visitorservice.deleteVisitor(id);
	}

}
