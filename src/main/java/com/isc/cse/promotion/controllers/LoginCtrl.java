package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.services.CarouselLoginService;
import com.isc.cse.promotion.models.services.UserService;
import com.isc.cse.promotion.projections.CarouselLoginProjection.DataImages;
import com.isc.cse.promotion.projections.UserProjection.UserAccess;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/login")
public class LoginCtrl {
	
	@Autowired
	private CarouselLoginService carouselLoginService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/data-images")
	public List<DataImages> getDataImages(){		
		return carouselLoginService.getDataImages("Login");
	}

	@GetMapping("/user-access")
	public List<UserAccess> getUserAccess(){
		return userService.getUserAccess();
	}
	
}
