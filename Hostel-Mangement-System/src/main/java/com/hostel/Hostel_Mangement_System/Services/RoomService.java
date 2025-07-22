package com.hostel.Hostel_Mangement_System.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.Hostel_Mangement_System.Repo.IRoomRepo;
import com.hostel.Hostel_Mangement_System.models.Room;

@Service
public class RoomService implements IRoomService {
	
	@Autowired
	IRoomRepo RoomRepo;
	@Override
	public Room createRoom(Room room) {
		// TODO Auto-generated method stub
		return RoomRepo.save(room);
	}

	@Override
	public Room updateRoom(Room room) {
		// TODO Auto-generated method stub
		return RoomRepo.save(room);
	}

	@Override
	public String deleteRoom(int id) {
		// TODO Auto-generated method stub
		Optional<Room> room=RoomRepo.findById(id);
		//check the object is ther or not

			if(room.isPresent())
			{
				Room rom=room.get();
				//delete
				RoomRepo.delete(rom);
				return "Room is deleted Successfully";
			}
			return "Room with "+id+" not found";
	}

	@Override
	public Room getByRoommId(int id) {
		// TODO Auto-generated method stub
		Optional<Room> optionalRoom=RoomRepo.findById(id);
		
		return (Room)optionalRoom.get();
	}

	@Override
	public List<Room> getAllRoom() {
		// TODO Auto-generated method stub
		return RoomRepo.findAll();
	}

}
