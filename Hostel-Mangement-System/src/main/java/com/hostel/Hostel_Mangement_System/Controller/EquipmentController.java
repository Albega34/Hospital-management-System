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

import com.hostel.Hostel_Mangement_System.Services.IEquipmentService;
import com.hostel.Hostel_Mangement_System.models.Equipment;

@RestController
@RequestMapping("api/equipment/")
public class EquipmentController {
	
	@Autowired
	IEquipmentService equipmentService;
	
	@GetMapping(value = "{id}")
	public Equipment getEquipByID(@PathVariable("id") int id) {
		return equipmentService.getBadEquipById(id);
	}

	// root mapping
	@GetMapping(value = "/")
	public List<Equipment> getAllEquip() {
		return equipmentService.getAllEquip();
	}

	@PostMapping(value = "create")
	public Equipment createEquip(@RequestBody Equipment equipment) {
		return equipmentService.createEquip(equipment);
	}

	@PutMapping(value = "edit")
	public Equipment updateEquip(@RequestBody Equipment equipment) {
		return equipmentService.updateEquip(equipment);
	}

	@DeleteMapping(value = "delete/{id}")
	public String deleteEquip(@PathVariable("id") int id) {
		return equipmentService.deleteEquip(id);
	}

}
