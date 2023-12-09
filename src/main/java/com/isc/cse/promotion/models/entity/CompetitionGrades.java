package com.isc.cse.promotion.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "competitionGrade")
public class CompetitionGrades implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompetitionGrade;

	@Column(nullable = false)
	private Long idinnovationGrade;

	@Column(nullable = false)
	private Long idCompetition;

	@Column(nullable = false)
	private Long idCity;

	@Column(length = 10, nullable = false)
	private String eventDate;

	public Long getIdCompetitionGrade() {
		return idCompetitionGrade;
	}

	public void setIdCompetitionGrade(Long idCompetitionGrade) {
		this.idCompetitionGrade = idCompetitionGrade;
	}

	public Long getIdinnovationGrade() {
		return idinnovationGrade;
	}

	public void setIdinnovationGrade(Long idinnovationGrade) {
		this.idinnovationGrade = idinnovationGrade;
	}

	public Long getIdCompetition() {
		return idCompetition;
	}

	public void setIdCompetition(Long idCompetition) {
		this.idCompetition = idCompetition;
	}

	public Long getIdCity() {
		return idCity;
	}

	public void setIdCity(Long idCity) {
		this.idCity = idCity;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	private static final long serialVersionUID = 1L;

}
