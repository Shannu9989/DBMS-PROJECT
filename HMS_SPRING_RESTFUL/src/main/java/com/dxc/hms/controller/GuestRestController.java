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

import com.dxc.hms.entity.GuestInfo;
import com.dxc.hms.service.IGuestService;

@RestController
@RequestMapping(path="/hms")
@CrossOrigin("http://localhost:4200")
public class GuestRestController {

	@Autowired
	GuestInfo guest;

	@Autowired
	IGuestService service;
	
	
	@GetMapping(path = "/getguestinfo/{id}")
	public GuestInfo get(@PathVariable("id")  int id) {

		
						
		
		return service.getGuestinfo(id);
		
	

	}
	
	
	@GetMapping(path="/getallguestinfo")
	public List<GuestInfo>  getAllguestinfo(){
		
		return service.getAllguestinfo();
		
		
	}
	
	
	

	@PostMapping(path = "/addguestinfo")
	public GuestInfo add(@RequestBody GuestInfo guest) {

	

		return service.addGuestInfo(guest);

	}
	

	@PutMapping(path = "/updateguestinfo", consumes = { "application/xml", "application/json" }, produces = { "application/xml","application/json" })
	public GuestInfo update(@RequestBody GuestInfo guest) {

	

		return service.updateGuestInfo(guest);

	}

	@DeleteMapping("/deleteGuestInfo/{id}")
	public String delete(@PathVariable("id") int id) {
		
		service.deleteGuestInfo(id);

		return "Guest deleted with id  " + id;

	}
	
	

}
