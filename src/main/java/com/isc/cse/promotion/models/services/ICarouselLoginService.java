package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.projections.CarouselLoginProjection.DataImages;

public interface ICarouselLoginService {

	public List<DataImages> getDataImages(String owner);
}
