package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Frameworks;

public interface IFrameworkService {

	public List<Frameworks> all();
	public Frameworks findById(Long idIFrameworks);
	public Frameworks add(Frameworks frameworks);
	public void delete(Long id);
}
