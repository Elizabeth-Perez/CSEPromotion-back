package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.IOpportunityDao;
import com.isc.cse.promotion.models.entity.Opportunities;

@Service
public class OpportunityService implements IOpportunityService {
	
	@Autowired
	private IOpportunityDao opportunityDao;

	@Override
	@Transactional(readOnly = true)
	public List<Opportunities> all() {
		return (List<Opportunities>) opportunityDao.findAll() ;
	}

	@Override
	@Transactional(readOnly = true)
	public Opportunities findById(Long idOpportunity) {
		return opportunityDao.findById(idOpportunity).orElse(null);
	}

	@Override
	public Opportunities add(Opportunities opportunity) {
		return opportunityDao.save(opportunity);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		opportunityDao.deleteById(id);
	}

}
