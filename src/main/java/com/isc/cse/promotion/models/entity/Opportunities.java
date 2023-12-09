package com.isc.cse.promotion.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "opportunity")
public class Opportunities implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOpportunity;
	
	@Column(length = 15, nullable = false)
	private String studyProgram;
	
	@Column(nullable = false)
	private Long idEntity;
	
	@Column(nullable = false)
	private Long idStay;
	
	@Column(nullable = false)
	private Long idParticipant;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String imageURL;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String hyperlink;

	public Long getIdOpportunity() {
		return idOpportunity;
	}

	public void setIdOpportunity(Long idOpportunity) {
		this.idOpportunity = idOpportunity;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public Long getIdEntity() {
		return idEntity;
	}

	public void setIdEntity(Long idEntity) {
		this.idEntity = idEntity;
	}

	public Long getIdStay() {
		return idStay;
	}

	public void setIdStay(Long idStay) {
		this.idStay = idStay;
	}

	public Long getIdParticipant() {
		return idParticipant;
	}

	public void setIdParticipant(Long idParticipant) {
		this.idParticipant = idParticipant;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getHyperlink() {
		return hyperlink;
	}

	public void setHyperlink(String hyperlink) {
		this.hyperlink = hyperlink;
	}

	private static final long serialVersionUID = 1L;

}
