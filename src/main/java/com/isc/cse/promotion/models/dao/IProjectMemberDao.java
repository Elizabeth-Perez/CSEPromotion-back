package com.isc.cse.promotion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.ProjectMembers;

public interface IProjectMemberDao extends CrudRepository<ProjectMembers, String> {

}
