package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.services.ICarrerService;
import com.isc.cse.promotion.projections.CarrerProjections.ContactInformation;
import com.isc.cse.promotion.projections.CarrerProjections.SocialNetwork;

@RestController
@RequestMapping("/dashboard")
public class DashboardCtrl {
	
	@Autowired
	private ICarrerService carrerService;
	
	
	@GetMapping("/contact-information")
	public List<ContactInformation> contactInformation(){
		return carrerService.getContactInformation();
	}
	
	@GetMapping("/social-network")
	public List<SocialNetwork> getSocialNetwork(){
		return carrerService.getSocialNetwork();
	}
}
