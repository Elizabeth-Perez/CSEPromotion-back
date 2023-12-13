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
@Table(name = "programming_language")
public class ProgrammingLanguages implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProgrammingLanguage;

	@ManyToMany
	@JoinTable(name = "specialities_languages", joinColumns = @JoinColumn(name = "id_speciality"), inverseJoinColumns = @JoinColumn(name = "id_programming_languages"))
	private Set<Specialities> speciality;

	@Column(length = 30, nullable = false)
	private String name;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String imageUrl;

	public Long getIdProgrammingLanguage() {
		return idProgrammingLanguage;
	}

	public void setIdProgrammingLanguage(Long idProgrammingLanguage) {
		this.idProgrammingLanguage = idProgrammingLanguage;
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
