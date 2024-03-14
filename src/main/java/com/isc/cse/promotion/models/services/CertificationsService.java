package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.ICertificationDao;
import com.isc.cse.promotion.models.entity.Certifications;

@Service
public class CertificationsService implements ICertificationsService {
	
	@Autowired
	private ICertificationDao certificationDao;

	@Override
	@Transactional(readOnly = true)
	public List<Certifications> all() {
		return (List<Certifications>) certificationDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Certifications findById(Long idICertification) {
		return certificationDao.findById(idICertification).orElse(null);
	}

	@Override
	public Certifications add(Certifications certification) {
		return certificationDao.save(certification);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		certificationDao.deleteById(id);
	}
	
}
