package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Equipment;

public interface IEquipmentService {
	public Equipment createEquip(Equipment equip);
	public Equipment updateEquip(Equipment equip);
	public String deleteEquip(int id);
	public Equipment getBadEquipById(int id);
	public List<Equipment> getAllEquip();

}
