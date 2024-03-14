package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IFunctionsDao;
import com.isc.cse.promotion.models.entity.Functions;

@Service
public class FunctionService implements IFunctionService{
	
	@Autowired
	private IFunctionsDao functionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Functions> all() {
		return (List<Functions>) functionDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Functions findById(Long idFunction) {
		return functionDao.findById(idFunction).orElse(null);
	}

	@Override
	public Functions add(Functions funtion) {
		return functionDao.save(funtion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		functionDao.deleteById(id);
	}
	
}
