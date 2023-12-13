package com.isc.cse.promotion.models.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "academy")
public class Academy implements Serializable {

	@Id
	@Column(length = 15, nullable = false)
	private String teacherEnrollment;

	@ManyToOne
	@JoinColumn(name = "study_program", nullable = false)
	private Carrer carrer;

	@ManyToMany
	@JoinTable(name = "academy_titulation", joinColumns = @JoinColumn(name = "teacher_enrollment"), inverseJoinColumns = @JoinColumn(name = "id_titulation_project"))
	private Set<TitulationProjects> titulationProyect;

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

	public Carrer getCarrer() {
		return carrer;
	}

	public void setCarrer(Carrer carrer) {
		this.carrer = carrer;
	}

	public Set<TitulationProjects> getProyect() {
		return titulationProyect;
	}

	public void setProyect(Set<TitulationProjects> titulationProyect) {
		this.titulationProyect = titulationProyect;
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
