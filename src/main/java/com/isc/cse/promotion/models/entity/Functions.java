package com.isc.cse.promotion.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "function_")
public class Functions implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFunction;

	@ManyToOne
	@JoinColumn(name = "key_speciality")
	private Specialities speciality;

	@Column(length = 100, nullable = false)
	private String name;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String description;

	public Long getIdFunction() {
		return idFunction;
	}

	public void setIdFunction(Long idFunction) {
		this.idFunction = idFunction;
	}

	public Specialities getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Specialities speciality) {
		this.speciality = speciality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private static final long serialVersionUID = 1L;

}
