package com.isc.cse.promotion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Stays;

public interface IStayDao extends CrudRepository<Stays, Long> {

}
