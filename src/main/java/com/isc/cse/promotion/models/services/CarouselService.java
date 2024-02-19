package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.ICarouselDao;
import com.isc.cse.promotion.models.entity.Carousels;

@Service
public class CarouselService implements ICarouselService {
	
	@Autowired
	private ICarouselDao carouselDao;

	@Override
	@Transactional(readOnly = true)
	public List<Carousels> all() {
		return (List<Carousels>) carouselDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Carousels findById(Long idCarousel) {
		return carouselDao.findById(idCarousel).orElse(null);
	}

	@Override
	public Carousels add(Carousels carousel) {
		return carouselDao.save(carousel);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		carouselDao.deleteById(id);
	}
}
