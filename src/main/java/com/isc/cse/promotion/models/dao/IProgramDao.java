package com.isc.cse.promotion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Programs;

public interface IProgramDao extends CrudRepository<Programs, Long> {

}
