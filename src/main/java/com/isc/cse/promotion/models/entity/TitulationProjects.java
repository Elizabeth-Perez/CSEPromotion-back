package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "titulation_project")
public class TitulationProjects implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTitulationProject;

	@Column(length = 15)
	private String teacherEnrollment2;

	@Temporal(TemporalType.DATE)
	private Date eventDate;

	public Long getIdTitulationProject() {
		return idTitulationProject;
	}

	public void setIdTitulationProject(Long idTitulationProject) {
		this.idTitulationProject = idTitulationProject;
	}

	public String getTeacherEnrollment2() {
		return teacherEnrollment2;
	}

	public void setTeacherEnrollment2(String teacherEnrollment2) {
		this.teacherEnrollment2 = teacherEnrollment2;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	private static final long serialVersionUID = 1L;

}
