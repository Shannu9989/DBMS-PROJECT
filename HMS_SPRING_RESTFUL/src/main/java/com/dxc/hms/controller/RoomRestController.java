package com.dxc.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dxc.hms.entity.Room;
import com.dxc.hms.service.IRoomService;

@RestController
@RequestMapping(path="/hms")
@CrossOrigin("http://localhost:4200")
public class RoomRestController {

	@Autowired
	Room room;

	@Autowired
	IRoomService service;
	
	
	@GetMapping(path = "/get/{rid}")// produces = { "application/json","application/xml"})
	public Room get(@PathVariable("rid")  int rid) {

		
						
		
		return service.getRoom(rid);
		
	

	}
	
	
	@GetMapping(path="/rooms")
	public List<Room>  getAllroom(){
		
		return service.getAllRooms();
		
		
	}
	
	
	

	@PostMapping(path = "/add")// consumes = { "application/xml", "application/json" }, produces = { "application/xml","application/json" })
	public Room add(@RequestBody Room room) {

	

		return service.addRoom(room);

	}
	

	@PutMapping(path = "/update", consumes = { "application/xml", "application/json" }, produces = { "application/xml","application/json" })
	public Room update(@RequestBody Room room) {

	

		return service.updateRoom(room);

	}

	@DeleteMapping("/delete/{rid}")
	public String delete(@PathVariable("rid") int rid) {
		
		service.deleteRoom(rid);

		return "room deleted with id  " + rid;

	}
	
	

}
