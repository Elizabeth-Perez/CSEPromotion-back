package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "innovation_project")
public class InnovationProjects implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idInnovationProject;

	private Long idObjetive;

	public Long getIdInnovationProject() {
		return idInnovationProject;
	}

	public void setIdInnovationProject(Long idInnovationProject) {
		this.idInnovationProject = idInnovationProject;
	}

	public Long getIdObjetive() {
		return idObjetive;
	}

	public void setIdObjetive(Long idObjetive) {
		this.idObjetive = idObjetive;
	}

	private static final long serialVersionUID = 1L;

}
