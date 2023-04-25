package com.dxc.hms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dxc.hms.entity.FoodInfo;
import java.util.List;
import com.dxc.hms.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/hms")
@CrossOrigin("http://localhost:4200")

public class FoodRestController {

	@Autowired
	FoodInfo food;

	@Autowired
	IFoodService service;

	@GetMapping(path = "/getitems/{id}")
	public FoodInfo get(@PathVariable("id") int id) {

		return service.getFood(id);

	}

	@GetMapping(path = "/fooditems")
	public List<FoodInfo> getAllFoodItems() {

		return service.getAllFoodItems();

	}

	@PostMapping(path = "/addfooditem")
	public FoodInfo add(@RequestBody FoodInfo food) {

		return service.addFood(food);

	}

	@PutMapping(path = "/updatefooditem", consumes = { "application/xml", "application/json" }, produces = {
			"application/xml", "application/json" })
	public FoodInfo update(@RequestBody FoodInfo food) {

		return service.updateFood(food);

	}

	@DeleteMapping("/deleteFoodItem/{id}")
	public String delete(@PathVariable("rid") int id) {

		service.deleteFoodItem(id);

		return "Food deleted with id  " + id;

	}

}
