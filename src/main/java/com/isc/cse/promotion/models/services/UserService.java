package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IUserDao;
import com.isc.cse.promotion.models.entity.Users;
import com.isc.cse.promotion.projections.UserProjection.UserAccess;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private IUserDao userDao;

	@Override
	public List<UserAccess> getUserAccess() {
		return userDao.getUserAccess();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Users> findAll() {
		return (List<Users>) userDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Users findById(String userEnrollment) {
		return userDao.findById(userEnrollment).orElse(null);
	}

	@Override
	@Transactional
	public Users save(Users user) {
		return userDao.save(user);
	}




	
}
