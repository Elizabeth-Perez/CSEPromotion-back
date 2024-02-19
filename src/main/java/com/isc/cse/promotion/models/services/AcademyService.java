package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IAcademyDao;
import com.isc.cse.promotion.models.entity.Academy;

@Service
public class AcademyService implements IAcademyService {
	
	@Autowired
	private IAcademyDao academyDao;

	@Override
	@Transactional(readOnly = true)
	public List<Academy> all() {
		return (List<Academy>) academyDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Academy findById(String teacherEnrollment) {
		return academyDao.findById(teacherEnrollment).orElse(null);
	}

	@Override
	public Academy add(Academy academy) {
		return academyDao.save(academy);
	}

	@Override
	@Transactional
	public void delete(String id) {
		academyDao.deleteById(id);	
	}

}
