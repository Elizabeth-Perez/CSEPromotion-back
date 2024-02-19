package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Carousels;
import com.isc.cse.promotion.models.entity.CarouselsLogin;

public interface ICarouselService {
	
	public List<Carousels> all();
	public Carousels findById(Long idCarousel);
	public Carousels add(Carousels carousel);
	public void delete(Long id);
}
