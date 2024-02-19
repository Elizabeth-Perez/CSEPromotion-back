package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IStayDao;
import com.isc.cse.promotion.models.entity.Stays;

@Service
public class StayService implements IStayService {
	
	@Autowired
	private IStayDao stayDao;

	@Override
	@Transactional(readOnly = true)
	public List<Stays> all() {
		return (List<Stays>) stayDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Stays findById(Long idStay) {
		return stayDao.findById(idStay).orElse(null);
	}

	@Override
	public Stays add(Stays stay) {
		return stayDao.save(stay);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		stayDao.deleteById(id);
	}
}
