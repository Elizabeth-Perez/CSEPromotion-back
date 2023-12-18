package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isc.cse.promotion.models.dao.IUserDao;
import com.isc.cse.promotion.projections.UserProjection.UserAccess;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUserDao userDao;

	@Override
	public List<UserAccess> getUserAccess() {
		return userDao.getUserAccess();
	}
	
}
