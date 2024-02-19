package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Entities;

public interface IEntityService {
	
	public List<Entities> all();
	public Entities findById(Long idEntity);
	public Entities add(Entities entity);
	public void delete(Long id);

}
