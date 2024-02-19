package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

@Entity
@Table(name = "program")
public class Programs implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProgram;
	
	@ManyToOne
	@JoinColumn(name = "study_program", nullable = false)
	private Carrer carrer;
	
	@ManyToOne
	@JoinColumn(name = "id_program_type", nullable = false)
	private ProgramType programType;
	
	@Column(length = 100, nullable = false)
	private String name;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String description;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String imageUrl;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String hyperlink;

	public Long getIdProgram() {
		return idProgram;
	}

	public void setIdProgram(Long idProgram) {
		this.idProgram = idProgram;
	}

	public Carrer getCarrer() {
		return carrer;
	}

	public void setCarrer(Carrer carrer) {
		this.carrer = carrer;
	}

	public ProgramType getProgramType() {
		return programType;
	}

	public void setProgramType(ProgramType programType) {
		this.programType = programType;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getHyperlink() {
		return hyperlink;
	}

	public void setHyperlink(String hyperlink) {
		this.hyperlink = hyperlink;
	}

	private static final long serialVersionUID = 1L;
}
