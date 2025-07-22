package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IVisitor;
import com.hostel.Hostel_Mangement_System.models.Visitor;

@Service
public class VisitorService implements IVisitorService {
	@Autowired
	IVisitor Visitorrepo;

	@Override
	public Visitor createVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return Visitorrepo.save(visitor);
	}

	@Override
	public Visitor updateVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return Visitorrepo.save(visitor);
	}

	@Override
	public String deleteVisitor(int id) {
		// TODO Auto-generated method stub
		Optional<Visitor> visitor=Visitorrepo.findById(id);
		//check the object is ther or not

			if(visitor.isPresent())
			{
				Visitor visit=visitor.get();
				//delete
				Visitorrepo.delete(visit);
				return "Visitor is deleted Successfully";
			}
			return "Visitor with "+id+" not found";
	}

	@Override
	public Visitor getvisitorbyId(int id) {
		// TODO Auto-generated method stub
	Optional<Visitor> optionalVisitor=Visitorrepo.findById(id);
		
		return (Visitor)optionalVisitor.get();		}

	@Override
	public List<Visitor> getAllVisitor() {
		// TODO Auto-generated method stub
		return Visitorrepo.findAll();
	}

}
