package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Opportunities;

public interface IOpportunityService {
	
	public List<Opportunities> all();
	public Opportunities findById(Long idOpportunity);
	public Opportunities add(Opportunities opportunity);
	public void delete(Long id);
}
