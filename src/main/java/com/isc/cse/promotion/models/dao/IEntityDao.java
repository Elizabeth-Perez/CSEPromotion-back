package com.isc.cse.promotion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Entities;

public interface IEntityDao extends CrudRepository<Entities, Long> {

}
