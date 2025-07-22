package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Visitor;

public interface IVisitorService {
	public Visitor createVisitor(Visitor visitor);
	public Visitor updateVisitor(Visitor visitor);
	public String deleteVisitor(int id);
	public Visitor getvisitorbyId(int id);
	public List<Visitor> getAllVisitor();

}
