package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Users;
import com.isc.cse.promotion.projections.UserProjection.UserAccess;

public interface IUserService {

	public List<UserAccess> getUserAccess();
	
	public List<Users> findAll();
	public Users findById(String userEnrollment);
	public Users save(Users user);
	
	
}
