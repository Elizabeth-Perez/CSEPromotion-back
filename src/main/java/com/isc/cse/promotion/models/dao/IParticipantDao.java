package com.isc.cse.promotion.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Participants;

public interface IParticipantDao extends CrudRepository<Participants, Long> {

}
