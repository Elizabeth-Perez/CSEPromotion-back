package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IProgramDao;
import com.isc.cse.promotion.models.entity.Programs;

@Service
public class ProgramService implements IProgramService {

	@Autowired
	private IProgramDao programDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Programs> all() {
		return (List<Programs>) programDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Programs findById(Long idProgram) {
		return programDao.findById(idProgram).orElse(null);
	}

	@Override
	public Programs add(Programs program) {
		return programDao.save(program);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		programDao.deleteById(id);
	}
}
