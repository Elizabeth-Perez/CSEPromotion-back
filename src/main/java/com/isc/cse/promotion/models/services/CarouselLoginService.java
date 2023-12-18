package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isc.cse.promotion.models.dao.ICarouselLoginDao;
import com.isc.cse.promotion.models.entity.CarouselsLogin;
import com.isc.cse.promotion.projections.CarouselLoginProjection.DataImages;

@Service
public class CarouselLoginService implements ICarouselLoginService {
	@Autowired
	private ICarouselLoginDao carouselLoginDao;

	@Override
	public List<DataImages> getDataImages(String owner) {
		return carouselLoginDao.getDataImages(owner);
	}

}
