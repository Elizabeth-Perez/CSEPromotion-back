package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IProgramTypeDao;
import com.isc.cse.promotion.models.entity.ProgramType;

@Service
public class ProgramTypeService implements IProgramTypeService {
	
	@Autowired
	private IProgramTypeDao programTypeDao;

	@Override
	@Transactional(readOnly = true)
	public List<ProgramType> all() {
		return (List<ProgramType>) programTypeDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ProgramType findById(Long idProgramType) {
		return programTypeDao.findById(idProgramType).orElse(null);
	}

	@Override
	public ProgramType add(ProgramType programType) {
		return programTypeDao.save(programType);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		programTypeDao.deleteById(id);
	}

}
