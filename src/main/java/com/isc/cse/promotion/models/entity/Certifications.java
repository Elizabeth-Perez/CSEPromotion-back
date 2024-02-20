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
@Table(name = "certification")
public class Certifications implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCertification;

	@ManyToOne
	@JoinColumn(name = "id_entity")
	private Entities entity;

	@ManyToOne
	@JoinColumn(name = "key_speciality")
	private Specialities speciality;

	@Column(length = 100, nullable = false)
	private String name;

	public Long getIdCertification() {
		return idCertification;
	}

	public void setIdCertification(Long idCertification) {
		this.idCertification = idCertification;
	}

	public Entities getEntity() {
		return entity;
	}

	public void setEntity(Entities entity) {
		this.entity = entity;
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

	private static final long serialVersionUID = 1L;

}
