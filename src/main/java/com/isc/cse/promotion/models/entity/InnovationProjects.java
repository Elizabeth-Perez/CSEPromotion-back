package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Entity;
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
@Table(name = "innovation_project")
public class InnovationProjects implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInnovationProject;
	
	@ManyToOne
	@JoinColumn(name = "id_project", nullable = false)
	private Projects project;
	
	@ManyToMany
	@JoinTable(name = "innovations_objectives", joinColumns = @JoinColumn(name = "id_innovation_project"), inverseJoinColumns = @JoinColumn(name = "id_objective"))
	private Set<Objectives> objective;

	public Long getIdInnovationProject() {
		return idInnovationProject;
	}

	public void setIdInnovationProject(Long idInnovationProject) {
		this.idInnovationProject = idInnovationProject;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

	public Set<Objectives> getObjective() {
		return objective;
	}

	public void setObjective(Set<Objectives> objective) {
		this.objective = objective;
	}

	private static final long serialVersionUID = 1L;

}
