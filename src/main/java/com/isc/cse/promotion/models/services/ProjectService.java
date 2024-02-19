package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IProjectDao;
import com.isc.cse.promotion.models.entity.Projects;

@Service
public class ProjectService implements IProjectService{
	
	@Autowired
	private IProjectDao projectDao;

	@Override
	@Transactional(readOnly = true)
	public List<Projects> all() {
		return (List<Projects>) projectDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Projects findById(Long idProject) {
		return projectDao.findById(idProject).orElse(null);
	}

	@Override
	public Projects add(Projects project) {
		return projectDao.save(project);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		projectDao.deleteById(id);
	}
}
