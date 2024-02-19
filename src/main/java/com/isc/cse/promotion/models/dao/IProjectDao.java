package com.isc.cse.promotion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Projects;

public interface IProjectDao extends CrudRepository<Projects, Long>{

}
