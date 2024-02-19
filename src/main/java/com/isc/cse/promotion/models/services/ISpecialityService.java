package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Specialities;

public interface ISpecialityService {
	
	public List<Specialities> all();
	public Specialities findById(String keySpeciality);
	public Specialities add(Specialities speciality);
	public void delete(String id);

}
