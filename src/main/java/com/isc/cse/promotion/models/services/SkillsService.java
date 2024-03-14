package com.isc.cse.promotion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isc.cse.promotion.models.dao.ISkillsDao;
import com.isc.cse.promotion.models.entity.Skills;

@Service
public class SkillsService implements ISkillsService {
	
	@Autowired
	private ISkillsDao skillDao;

	@Override
	@Transactional(readOnly = true)
	public List<Skills> all() {
		return (List<Skills>) skillDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Skills findById(Long idSkills) {
		return skillDao.findById(idSkills).orElse(null);
	}

	@Override
	public Skills add(Skills skill) {
		return skillDao.save(skill);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		skillDao.deleteById(id);
	}
}
