package com.isc.cse.promotion.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name = "program_type")
public class ProgramType implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProgramType;
	
	@Column(length = 30, nullable = false)
	private String name;

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

	private static final long serialVersionUID = 1L;

}
