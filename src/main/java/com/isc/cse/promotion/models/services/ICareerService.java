package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Carrer;

public interface ICareerService {

	public List<Carrer> all();
	public Carrer findById(String studyProgram);
	public Carrer add(Carrer carrer);
	public void delete(String id);
}
