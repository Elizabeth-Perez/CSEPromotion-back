package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Stays;

public interface IStayService {
	
	public List<Stays> all();
	public Stays findById(Long idStay);
	public Stays add(Stays stay);
	public void delete(Long id);
}
