package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Participants;

public interface IParticipantService {
	
	public List<Participants> all();
	public Participants findById(Long idParticipants);
	public Participants add(Participants participant);
	public void delete(Long id);
}
