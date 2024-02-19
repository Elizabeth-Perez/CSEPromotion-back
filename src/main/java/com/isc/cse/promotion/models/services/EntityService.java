package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IEntityDao;
import com.isc.cse.promotion.models.entity.Entities;

@Service
public class EntityService implements IEntityService {
	
	@Autowired
	private IEntityDao entityDao;

	@Override
	@Transactional(readOnly = true)
	public List<Entities> all() {
		return (List<Entities>) entityDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Entities findById(Long idEntity) {
		return entityDao.findById(idEntity).orElse(null);
	}

	@Override
	public Entities add(Entities entity) {
		return entityDao.save(entity);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		entityDao.deleteById(id);
	}

}
