package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IProjectMemberDao;
import com.isc.cse.promotion.models.entity.ProjectMembers;

@Service
public class ProjectMembersService implements IProjectMembersService {
	
	@Autowired
	private IProjectMemberDao projectMemberDao;

	@Override
	@Transactional(readOnly = true)
	public List<ProjectMembers> all() {
		return (List<ProjectMembers>) projectMemberDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public ProjectMembers findById(String controlNumber) {
		return projectMemberDao.findById(controlNumber).orElse(null);
	}

	@Override
	public ProjectMembers add(ProjectMembers projectMember) {
		return projectMemberDao.save(projectMember);
	}

	@Override
	@Transactional
	public void delete(String id) {
		projectMemberDao.deleteById(id);
	}

}
