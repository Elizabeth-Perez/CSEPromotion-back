package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IParticipantDao;
import com.isc.cse.promotion.models.entity.Participants;

@Service
public class ParticipantService implements IParticipantService {

	@Autowired
	private IParticipantDao participantDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Participants> all() {
		return (List<Participants>) participantDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Participants findById(Long idParticipants) {
		return participantDao.findById(idParticipants).orElse(null);
	}

	@Override
	public Participants add(Participants participant) {
		return participantDao.save(participant);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		participantDao.deleteById(id);
	}

}
