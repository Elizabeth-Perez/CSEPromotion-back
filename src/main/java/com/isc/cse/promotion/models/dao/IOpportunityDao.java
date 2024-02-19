package com.isc.cse.promotion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Opportunities;

public interface IOpportunityDao extends CrudRepository<Opportunities, Long> {

}
