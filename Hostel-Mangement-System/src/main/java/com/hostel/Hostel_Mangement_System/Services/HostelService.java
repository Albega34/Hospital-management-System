package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IHostelRepo;
import com.hostel.Hostel_Mangement_System.models.Hostel;

@Service
public class HostelService implements IHostelService {
	@Autowired
	IHostelRepo Hostelrepo;
	
	@Override
	public Hostel createHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		return Hostelrepo.save(hostel);
	}

	@Override
	public Hostel updateHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		return Hostelrepo.save(hostel);
	}

	@Override
	public String deleteHostel(int id) {
		// TODO Auto-generated method stub
		Optional<Hostel> hostel=Hostelrepo.findById(id);
		//check the object is their or not

			if(hostel.isPresent())
			{
				Hostel host=hostel.get();
				//delete
				Hostelrepo.delete(host);
				return "hostel is deleted Successfully";
			}
			return "hostel with "+id+" not found";
	}

	@Override
	public Hostel getHostelbyId(int id) {
		// TODO Auto-generated method stub
		Optional<Hostel> optionalHostel=Hostelrepo.findById(id);
		
		return (Hostel)optionalHostel.get();	}

	@Override
	public List<Hostel> getAllHostel() {
		// TODO Auto-generated method stub
		return Hostelrepo.findAll();
	}

}
