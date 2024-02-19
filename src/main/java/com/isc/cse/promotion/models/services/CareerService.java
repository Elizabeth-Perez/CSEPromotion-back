package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.ICareerDao;
import com.isc.cse.promotion.models.entity.Carrer;

@Service
public class CareerService implements ICareerService{
	
	@Autowired
	private ICareerDao careerDao;

	@Override
	@Transactional(readOnly = true)
	public List<Carrer> all() {
		return (List<Carrer>) careerDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Carrer findById(String studyProgram) {
		return careerDao.findById(studyProgram).orElse(null);
	}

	@Override
	public Carrer add(Carrer carrer) {
		return careerDao.save(carrer);
	}

	@Override
	@Transactional
	public void delete(String id) {
		careerDao.deleteById(id);
	}

}
