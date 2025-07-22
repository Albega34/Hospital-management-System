package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;

import com.hostel.Hostel_Mangement_System.models.Room;

public interface IRoomService {
	public Room createRoom(Room room);
	public Room updateRoom(Room room);
	public String deleteRoom(int id);
	public Room getByRoommId(int id);
	public List<Room> getAllRoom();

}
