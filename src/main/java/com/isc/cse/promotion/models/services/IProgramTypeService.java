package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.ProgramType;

public interface IProgramTypeService {

	public List<ProgramType> all();
	public ProgramType findById(Long idProgramType);
	public ProgramType add(ProgramType programType);
	public void delete(Long id);
}
