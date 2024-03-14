package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Functions;

public interface IFunctionService {
	
	public List<Functions> all();
	public Functions findById(Long idFunction);
	public Functions add(Functions function);
	public void delete(Long id);
}
