package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IEquipmentRepo;
import com.hostel.Hostel_Mangement_System.models.Equipment;

@Service
public class EquipmentService implements IEquipmentService {
	
	@Autowired
	IEquipmentRepo equipmentRepo;

	@Override
	public Equipment createEquip(Equipment equip) {
		// TODO Auto-generated method stub
	    return equipmentRepo.save(equip);	
	    }

	@Override
	public Equipment updateEquip(Equipment equip) {
		// TODO Auto-generated method stub
	    return equipmentRepo.save(equip);	
	}

	@Override
	public String deleteEquip(int id) {
		// TODO Auto-generated method stub
		Optional<Equipment> equip = equipmentRepo.findById(id);
		// check the object is there or not
		if (equip.isPresent()) {
			Equipment eq = equip.get();
			// delete
			equipmentRepo.delete(eq);
			return "equipment is deleted Successfully";
		}
		return "equipment with " + id + " not found";	
		}

	@Override
	public Equipment getBadEquipById(int id) {
		// TODO Auto-generated method stub
		Optional<Equipment> optionalEquip = equipmentRepo.findById(id);

		return (Equipment) optionalEquip.get();
		
	}

	@Override
	public List<Equipment> getAllEquip() {
		// TODO Auto-generated method stub
		return equipmentRepo.findAll();
		}

}
