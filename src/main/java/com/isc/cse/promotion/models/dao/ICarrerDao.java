package com.isc.cse.promotion.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Carrer;
import com.isc.cse.promotion.projections.CarrerProjections.ContactInformation;
import com.isc.cse.promotion.projections.CarrerProjections.SocialNetwork;

public interface ICarrerDao extends CrudRepository<Carrer, String> {
	
	@Query("SELECT c.phone AS phone, c.email AS email FROM Carrer c")
    List<ContactInformation> getContactInformation();
	
	@Query("SELECT c.snFacebook AS snFacebook, c.snInstagram AS snInstagram, c.snLinkedin AS snLinkedin FROM Carrer c")
	List<SocialNetwork> getSocialNetwork();


}
