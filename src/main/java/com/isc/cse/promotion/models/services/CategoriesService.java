package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.ICategoryDao;
import com.isc.cse.promotion.models.entity.Categories;

@Service
public class CategoriesService implements ICategoriesService {
	
	@Autowired
	private ICategoryDao categoryDao;

	@Override
	@Transactional(readOnly = true)
	public List<Categories> all() {
		return (List<Categories>) categoryDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Categories findById(Long idCategory) {
		return categoryDao.findById(idCategory).orElse(null);
	}

	@Override
	public Categories add(Categories category) {
		return categoryDao.save(category);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		categoryDao.deleteById(id);
	}

}
