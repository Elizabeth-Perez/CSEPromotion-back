package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Projects;

public interface IProjectService {

	public List<Projects> all();
	public Projects findById(Long idProject);
	public Projects add(Projects project);
	public void delete(Long id);
}
