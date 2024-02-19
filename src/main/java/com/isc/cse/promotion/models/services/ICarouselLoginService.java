package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.CarouselsLogin;
import com.isc.cse.promotion.projections.CarouselLoginProjection.DataImages;

public interface ICarouselLoginService {

	public List<DataImages> getDataImages(String owner);
	public List<CarouselsLogin> all();
	public CarouselsLogin findById(Long idCarouselLogin);
	public CarouselsLogin add(CarouselsLogin carouselLogin);
	public void delete(Long id);
}
