package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IProgrammingDao;
import com.isc.cse.promotion.models.entity.ProgrammingLanguages;

@Service
public class ProgrammingService implements IProgrammingService  {
	
	@Autowired
	private IProgrammingDao programmingDao;

	@Override
	@Transactional(readOnly = true)
	public List<ProgrammingLanguages> all() {
		return (List<ProgrammingLanguages>) programmingDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ProgrammingLanguages findById(Long idProgrammingLanguages) {
		return programmingDao.findById(idProgrammingLanguages).orElse(null);
	}

	@Override
	public ProgrammingLanguages add(ProgrammingLanguages programmingLanguages) {
		return programmingDao.save(programmingLanguages);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		programmingDao.deleteById(id);
	}
}
