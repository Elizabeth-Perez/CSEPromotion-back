package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.models.entity.Skills;

public interface ISkillsService {
	
	public List<Skills> all();
	public Skills findById(Long idSkills);
	public Skills add(Skills skill);
	public void delete(Long id);
}
