package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.ICarrerDao;
import com.isc.cse.promotion.models.entity.Carrer;
import com.isc.cse.promotion.projections.CarrerProjections.ContactInformation;
import com.isc.cse.promotion.projections.CarrerProjections.SocialNetwork;

@Service
public class CarrerService implements ICarrerService{

	@Autowired
	private ICarrerDao carrerDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Carrer> all() {
		return (List<Carrer>) carrerDao.findAll();
	}

	@Override
	public List<ContactInformation> getContactInformation() {
		return carrerDao.getContactInformation();
	}

	@Override
	public List<SocialNetwork> getSocialNetwork() {
		return carrerDao.getSocialNetwork();
	}
	

}
