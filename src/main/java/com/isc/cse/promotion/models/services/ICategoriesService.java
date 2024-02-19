package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Categories;

public interface ICategoriesService {

	public List<Categories> all();
	public Categories findById(Long idCategory);
	public Categories add(Categories category);
	public void delete(Long id);
}
