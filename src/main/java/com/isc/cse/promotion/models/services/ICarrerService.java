package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Carrer;
import com.isc.cse.promotion.projections.CarrerProjections.ContactInformation;
import com.isc.cse.promotion.projections.CarrerProjections.SocialNetwork;


public interface ICarrerService {

	public List<Carrer> all();
	public List<ContactInformation> getContactInformation();
	public List<SocialNetwork> getSocialNetwork();
	
}
