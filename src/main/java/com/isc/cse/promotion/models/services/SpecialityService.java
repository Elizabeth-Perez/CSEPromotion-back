package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.ISpecialityDao;
import com.isc.cse.promotion.models.entity.Specialities;

@Service
public class SpecialityService implements ISpecialityService{

	@Autowired
	private ISpecialityDao specialityDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Specialities> all() {
		return (List<Specialities>) specialityDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Specialities findById(String keySpeciality) {
		return specialityDao.findById(keySpeciality).orElse(null);
	}

	@Override
	public Specialities add(Specialities speciality) {
		return specialityDao.save(speciality);
	}

	@Override
	@Transactional
	public void delete(String id) {
		specialityDao.deleteById(id);
		
	}

}
