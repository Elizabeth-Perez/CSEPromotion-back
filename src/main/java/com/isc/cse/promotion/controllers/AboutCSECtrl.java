package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.entity.Carousels;
import com.isc.cse.promotion.models.entity.Carrer;
import com.isc.cse.promotion.models.services.CareerService;
import com.isc.cse.promotion.models.services.CarouselService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/about-cse")
public class AboutCSECtrl {
	
	@Autowired
	private CarouselService carouselService;
	
	@Autowired
	private CareerService careerService;
	
	@GetMapping("/carousels/all")
	public List<Carousels> allCarousel(){
		return carouselService.all();
	}
	
	@GetMapping("/careers/all")
	public List<Carrer> allCareers(){
		return careerService.all();
	}
}
