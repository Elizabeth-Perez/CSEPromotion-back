package com.isc.cse.promotion.models.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ide")
public class Ides implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idIde;

	@ManyToMany
	@JoinTable(name = "specialities_ides", joinColumns = @JoinColumn(name = "id_speciality"), inverseJoinColumns = @JoinColumn(name = "id_ide"))
	private Set<Specialities> speciality;

	@Column(length = 30, nullable = false)
	private String name;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String imageUrl;

	public Long getIdIde() {
		return idIde;
	}

	public void setIdIde(Long idIde) {
		this.idIde = idIde;
	}

	public Set<Specialities> getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Set<Specialities> speciality) {
		this.speciality = speciality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	private static final long serialVersionUID = 1L;

}
