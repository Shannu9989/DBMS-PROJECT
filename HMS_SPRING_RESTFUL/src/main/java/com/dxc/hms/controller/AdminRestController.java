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

import com.dxc.hms.entity.AdminInfo;
import com.dxc.hms.service.IadminService;


@RestController
@RequestMapping(path="/hms")
@CrossOrigin("http://localhost:4200")
public class AdminRestController {

	@Autowired
	AdminInfo admin;

	@Autowired
	IadminService service;
	
	
	@GetMapping(path = "/getadmininfo/{id}")
	public AdminInfo get(@PathVariable("id")  int id) {

		
						
		
		return service.getAdmininfo(id);
		
	

	}
	
	
	@GetMapping(path="/getalladmininfo")
	public List<AdminInfo>  getAlladmininfo(){
		
		return service.getAllAdmininfo();
		
		
	}
	
	
	

	@PostMapping(path = "/addadmininfo")
	public AdminInfo add(@RequestBody AdminInfo admin) {

	

		return service.addAdmininfo(admin);

	}
	

	@PutMapping(path = "/updateadmininfo", consumes = { "application/xml", "application/json" }, produces = { "application/xml","application/json" })
	public AdminInfo update(@RequestBody AdminInfo admin) {

	

		return service.updateAdmininfo(admin);

	}

	@DeleteMapping("/deleteAdmin/{id}")
	public String delete(@PathVariable("id") int id) {
		
		service.deleteAdmininfo(id);
		
		return "Admin deleted with id  " + id;

	}
	
	

}
