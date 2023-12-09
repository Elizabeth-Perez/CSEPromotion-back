package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "project")
public class Projects implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProject;
	
	@Column(length = 15, nullable = false)
	private String studyProgram;
	
	@Column(length = 15, nullable = false)
	private String teacherEnrollment;
	
	@Column(length = 10, nullable = false)
	private String controlNumber;
	
	private Long idCategory;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String name;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String description;

	public Long getIdProject() {
		return idProject;
	}

	public void setIdProject(Long idProject) {
		this.idProject = idProject;
	}

	public String getStudyProgram() {
		return studyProgram;
	}

	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}

	public String getTeacherEnrollment() {
		return teacherEnrollment;
	}

	public void setTeacherEnrollment(String teacherEnrollment) {
		this.teacherEnrollment = teacherEnrollment;
	}

	public String getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}

	public Long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
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
