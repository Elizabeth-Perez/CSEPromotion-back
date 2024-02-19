package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Programs;
import com.isc.cse.promotion.models.entity.Projects;

public interface IProgramService {
	
	public List<Programs> all();
	public Programs findById(Long idProgram);
	public Programs add(Programs program);
	public void delete(Long id);

}
