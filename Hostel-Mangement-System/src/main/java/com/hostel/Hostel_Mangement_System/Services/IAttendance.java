package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Attendance;

public interface IAttendance {
	public Attendance createAttend(Attendance attendance);
	public Attendance updateAttend(Attendance attendance);
	public String deleteAttend(int id);
	public Attendance getAttendById(int id);
	public List<Attendance> getAllAttend();

}
