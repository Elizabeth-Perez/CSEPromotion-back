package com.isc.cse.promotion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Categories;

public interface ICategoryDao extends CrudRepository<Categories, Long> {

}
