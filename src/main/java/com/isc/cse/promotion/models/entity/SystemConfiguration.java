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
@Table(name = "system_configuration")
public class SystemConfiguration implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSystemConfiguration;

	@ManyToOne
	@JoinColumn(name = "user_enrollment", nullable = false)
	private Users user;

	@Column(length = 15, nullable = false)
	private boolean sesion;

	public Long getIdSystemConfiguration() {
		return idSystemConfiguration;
	}

	public void setIdSystemConfiguration(Long idSystemConfiguration) {
		this.idSystemConfiguration = idSystemConfiguration;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public boolean isSesion() {
		return sesion;
	}

	public void setSesion(boolean sesion) {
		this.sesion = sesion;
	}

	private static final long serialVersionUID = 1L;

}
