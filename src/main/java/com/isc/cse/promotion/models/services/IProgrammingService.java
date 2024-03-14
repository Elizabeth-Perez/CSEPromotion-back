package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.ProgrammingLanguages;

public interface IProgrammingService {

	public List<ProgrammingLanguages> all();
	public ProgrammingLanguages findById(Long idProgrammingLanguages);
	public ProgrammingLanguages add(ProgrammingLanguages programmingLanguages);
	public void delete(Long id);
}
