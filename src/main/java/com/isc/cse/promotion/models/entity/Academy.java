package com.isc.cse.promotion.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "academy")
public class Academy implements Serializable {

	@Id
	@Column(length = 15, nullable = false)
	private String teacherEnrollment;
	
	@Column(length = 50, nullable = false)
	private String firstName;
	
	@Column(length = 50, nullable = false)
	private String lastName;
	
	@Column(length = 15, nullable = false)
	private String degree;
	
	@Column(length = 15, nullable = false)
	private String rol;
	
	@Column(length = 100, nullable = false)
	private String email;

	public String getTeacherEnrollment() {
		return teacherEnrollment;
	}

	public void setTeacherEnrollment(String teacherEnrollment) {
		this.teacherEnrollment = teacherEnrollment;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private static final long serialVersionUID = 1L;

}
