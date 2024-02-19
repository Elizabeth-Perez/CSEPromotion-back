package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Academy;

public interface IAcademyService {
	
	public List<Academy> all();
	public Academy findById(String teacherEnrollment);
	public Academy add(Academy academy);
	public void delete(String id);

}
