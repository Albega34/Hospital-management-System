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

import com.hostel.Hostel_Mangement_System.Services.IRoomService;
import com.hostel.Hostel_Mangement_System.models.Room;

@RestController
@RequestMapping("api/room/")
public class RoomController {
	@Autowired
	IRoomService Roomservice;
	
	@GetMapping(value = "{id}")
	public Room getRoomByID(@PathVariable("id")int id)
	{
		return Roomservice.getByRoommId(id);
	}
	//root mapping
	@GetMapping(value = "/")
	public List<Room> getAllRoom()
	{
		return Roomservice.getAllRoom();
	}

	@PostMapping(value = "create")
	public Room createRoom(@RequestBody Room room)
	{
		return Roomservice.createRoom(room);
	}
	@PutMapping(value = "edit")
	public Room editRoom(@RequestBody Room room)
	{
		return Roomservice.updateRoom(room);
	}
	@DeleteMapping(value = "delete/{id}")
	public String deleteRoom(@PathVariable("id") int id)
	{
		return Roomservice.deleteRoom(id);
	}

}
