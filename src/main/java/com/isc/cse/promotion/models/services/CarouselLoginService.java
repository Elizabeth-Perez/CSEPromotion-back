package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	@Transactional(readOnly = true)
	public List<CarouselsLogin> all() {
		return (List<CarouselsLogin>) carouselLoginDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public CarouselsLogin findById(Long idCarouselLogin) {
		return carouselLoginDao.findById(idCarouselLogin).orElse(null);
	}

	@Override
	public CarouselsLogin add(CarouselsLogin carouselLogin) {
		return carouselLoginDao.save(carouselLogin);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		carouselLoginDao.deleteById(id);
	}
}
