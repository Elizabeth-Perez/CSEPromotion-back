package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.entity.Carousels;
import com.isc.cse.promotion.models.entity.Carrer;
import com.isc.cse.promotion.models.entity.Opportunities;
import com.isc.cse.promotion.models.entity.Programs;
import com.isc.cse.promotion.models.entity.Projects;
import com.isc.cse.promotion.models.entity.Specialities;
import com.isc.cse.promotion.models.services.CareerService;
import com.isc.cse.promotion.models.services.CarouselService;
import com.isc.cse.promotion.models.services.OpportunityService;
import com.isc.cse.promotion.models.services.ProgramService;
import com.isc.cse.promotion.models.services.ProjectService;
import com.isc.cse.promotion.models.services.SpecialityService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/dashboard")
public class DashboardCtrl {

	@Autowired
	private CarouselService carouselService;

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private ProgramService programService;
	
	@Autowired
	private SpecialityService specialityService;
	
	@Autowired
	private OpportunityService opportunityService;
	
	@Autowired
	private CareerService careerService;
	
	@GetMapping("/all")
	public List<Carousels> allCarousel(){
		return carouselService.all();
	}
	
	@GetMapping("/projects/all")
	public List<Projects> allProjects(){
		return projectService.all();
	}
	
	@GetMapping("/programs/all")
	public List<Programs> allPrograms(){
		return programService.all();
	}
	
	@GetMapping("/specialities/all")
	public List<Specialities> allSpecialities(){
		return specialityService.all();
	}
	
	@GetMapping("/opportunities/all")
	public List<Opportunities> allOpportunities(){
		return opportunityService.all();
	}
	
	@GetMapping("/careers/all")
	public List<Carrer> allCareer(){
		return careerService.all();
	}
}
