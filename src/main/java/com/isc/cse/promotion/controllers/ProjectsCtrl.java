package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.entity.Carousels;
import com.isc.cse.promotion.models.entity.Projects;
import com.isc.cse.promotion.models.services.CarouselService;
import com.isc.cse.promotion.models.services.ProjectService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/projects")
public class ProjectsCtrl {
	
	@Autowired
	private ProjectService projectsService;
	
	@Autowired
	private CarouselService carouselService;
	
	@GetMapping("/carousels/all")
	public List<Carousels> getCarousels(){		
		return carouselService.all();
	}
	
	@GetMapping("/all")
	public List<Projects> getProjects(){		
		return projectsService.all();
	}

}
