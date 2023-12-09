package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "program")
public class Programs implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPrograms;
	
	@Column(length = 15, nullable = false)
	private String studyProgram;
	
	private Long idProgramType;
	
	@Column(length = 30, nullable = false)
	private String name;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String description;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String imageUrl;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String hyperlink;

	public Long getIdPrograms() {
		return idPrograms;
	}

	public void setIdPrograms(Long idPrograms) {
		this.idPrograms = idPrograms;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public Long getIdProgramType() {
		return idProgramType;
	}

	public void setIdProgramType(Long idProgramType) {
		this.idProgramType = idProgramType;
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
