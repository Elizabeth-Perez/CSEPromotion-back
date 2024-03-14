package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Ides;

public interface IIdesService {

	public List<Ides> all();
	public Ides findById(Long idIdes);
	public Ides add(Ides ides);
	public void delete(Long id);
}
