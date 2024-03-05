package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.entity.Specialities;
import com.isc.cse.promotion.models.services.SpecialityService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/specialities")
public class SpecialitiesCtrl {
	
	@Autowired
	private SpecialityService specialityService;
	
	@GetMapping("/all")
	public List<Specialities> getSpecialities(){		
		return specialityService.all();
	}

}
