package com.isc.cse.promotion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isc.cse.promotion.models.entity.Users;
import com.isc.cse.promotion.models.services.CarouselLoginService;
import com.isc.cse.promotion.models.services.UserService;
import com.isc.cse.promotion.projections.CarouselLoginProjection.DataImages;

@CrossOrigin(origins = {"http://csepromotion.s3-website.us-east-2.amazonaws.com/"})
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
	
	@GetMapping("/all")
	public List<Users> all(){
		return userService.all();
	}
	
	@GetMapping("/all/{userEnrollment}")
	public Users findById(@PathVariable String userEnrollment){
		return userService.findById(userEnrollment);
	}
	
	@PutMapping("/update/{userEnrollment}")
	public Users update(@RequestBody Users user, @PathVariable String userEnrollment) {
		Users userCurrent = userService.findById(userEnrollment);
		userCurrent.setCarrer(user.getCarrer());
		userCurrent.setFirstName(user.getFirstName());
		userCurrent.setLastName(user.getLastName());
		userCurrent.setUser(user.getUser());
		userCurrent.setPassword(user.getPassword());
		return userService.add(userCurrent);
	}
	
}
