package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "project")
public class Projects implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProject;

	@ManyToOne
	@JoinColumn(name = "study_program", nullable = false)
	private Carrer carrer;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "projects_academy", joinColumns = @JoinColumn(name = "id_project"), inverseJoinColumns = @JoinColumn(name = "teacher_enrollment"))
	private Set<Academy> academy;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "projects_projectmembers", joinColumns = @JoinColumn(name = "id_project", nullable = false), inverseJoinColumns = @JoinColumn(name = "control_number", nullable = false))
	private Set<ProjectMembers> projectMember;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "projects_categories", joinColumns = @JoinColumn(name = "id_project"), inverseJoinColumns = @JoinColumn(name = "id_category"))
	private Set<Categories> category;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String name;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String description;
	
	@Column(columnDefinition = "TEXT", nullable = false)
	private String imageUrl;

	public Long getIdProject() {
		return idProject;
	}

	public void setIdProject(Long idProject) {
		this.idProject = idProject;
	}

	public Carrer getCarrer() {
		return carrer;
	}

	public void setCarrer(Carrer carrer) {
		this.carrer = carrer;
	}

	public Set<Academy> getAcademy() {
		return academy;
	}

	public void setAcademy(Set<Academy> academy) {
		this.academy = academy;
	}

	public Set<ProjectMembers> getProjectMember() {
		return projectMember;
	}

	public void setProjectMember(Set<ProjectMembers> projectMember) {
		this.projectMember = projectMember;
	}

	public Set<Categories> getCategory() {
		return category;
	}

	public void setCategory(Set<Categories> category) {
		this.category = category;
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

	private static final long serialVersionUID = 1L;

}
