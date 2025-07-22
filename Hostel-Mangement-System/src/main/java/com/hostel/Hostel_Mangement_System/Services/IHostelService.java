package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Hostel;

public interface IHostelService {
	public Hostel createHostel(Hostel hostel);
	public Hostel updateHostel(Hostel hostel);
	public String deleteHostel(int id);
	public Hostel getHostelbyId(int id);
	public List<Hostel> getAllHostel();
	
	

}
