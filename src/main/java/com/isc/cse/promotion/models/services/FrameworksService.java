package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IFrameworksDao;
import com.isc.cse.promotion.models.entity.Frameworks;

@Service
public class FrameworksService implements IFrameworkService {

	@Autowired
	private IFrameworksDao frameworkDao;

	@Override
	@Transactional(readOnly = true)
	public List<Frameworks> all() {
		return (List<Frameworks>) frameworkDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Frameworks findById(Long idIFrameworks) {
		return frameworkDao.findById(idIFrameworks).orElse(null);
	}

	@Override
	public Frameworks add(Frameworks frameworks) {
		return frameworkDao.save(frameworks);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		frameworkDao.deleteById(id);
	}
	
	
}
