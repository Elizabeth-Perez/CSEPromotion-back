package com.isc.cse.promotion.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "speciality")
public class Specialities implements Serializable {

	@Id
	@Column(length = 8, nullable = false)
	private String keySpeciality;
	
	@Column(length = 15, nullable = false)
	private String studyProgram;
	
	@Column(length = 30, nullable = false)
	private String name;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String definition;

	public String getKeySpeciality() {
		return keySpeciality;
	}

	public void setKeySpeciality(String keySpeciality) {
		this.keySpeciality = keySpeciality;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	private static final long serialVersionUID = 1L;

}
