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
@Table(name = "competitionGrade")
public class CompetitionGrades implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompetitionGrade;

	@ManyToOne
	@JoinColumn(name = "id_Innovation_project", nullable = false)
	private InnovationProjects innovationProject;

	@ManyToOne
	@JoinColumn(name = "id_competition", nullable = false)
	private Competitions competition;

	@ManyToOne
	@JoinColumn(name = "id_city", nullable = false)
	private Cities city;

	@Column(length = 10, nullable = false)
	private String eventDate;

	public Long getIdCompetitionGrade() {
		return idCompetitionGrade;
	}

	public void setIdCompetitionGrade(Long idCompetitionGrade) {
		this.idCompetitionGrade = idCompetitionGrade;
	}

	public InnovationProjects getInnovationProject() {
		return innovationProject;
	}

	public void setInnovationProject(InnovationProjects innovationProject) {
		this.innovationProject = innovationProject;
	}

	public Competitions getCompetition() {
		return competition;
	}

	public void setCompetition(Competitions competition) {
		this.competition = competition;
	}
	
	public Cities getCity() {
		return city;
	}

	public void setCity(Cities city) {
		this.city = city;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	private static final long serialVersionUID = 1L;

}
