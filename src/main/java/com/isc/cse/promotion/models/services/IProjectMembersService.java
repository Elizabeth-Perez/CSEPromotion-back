package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.ProjectMembers;

public interface IProjectMembersService {

	public List<ProjectMembers> all();
	public ProjectMembers findById(String controlNumber);
	public ProjectMembers add(ProjectMembers projectMember);
	public void delete(String id);
}
