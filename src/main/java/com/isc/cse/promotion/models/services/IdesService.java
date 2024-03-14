package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IIdesDao;
import com.isc.cse.promotion.models.entity.Ides;

@Service
public class IdesService implements IIdesService {

	@Autowired
	private IIdesDao ideDao;

	@Override
	@Transactional(readOnly = true)
	public List<Ides> all() {
		return (List<Ides>) ideDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Ides findById(Long idIdes) {
		return ideDao.findById(idIdes).orElse(null);
	}

	@Override
	public Ides add(Ides ides) {
		return ideDao.save(ides);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		ideDao.deleteById(id);
	}
	
}
