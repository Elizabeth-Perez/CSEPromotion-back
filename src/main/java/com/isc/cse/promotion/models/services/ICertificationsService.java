package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Certifications;

public interface ICertificationsService {
	
	public List<Certifications> all();
	public Certifications findById(Long idICertification);
	public Certifications add(Certifications certification);
	public void delete(Long id);

}
