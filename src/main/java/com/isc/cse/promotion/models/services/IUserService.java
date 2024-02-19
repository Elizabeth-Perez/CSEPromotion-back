package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Users;

public interface IUserService {
	
	public List<Users> all();
	
	public Users findById(String userEnrollment);
	
	public Users add(Users user);
	
	
}
