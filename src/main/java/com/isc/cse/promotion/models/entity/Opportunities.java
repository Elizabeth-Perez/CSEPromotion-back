package com.isc.cse.promotion.models.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "opportunity")
public class Opportunities implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOpportunity;

	@ManyToOne
	@JoinColumn(name = "study_program", nullable = false)
	private Carrer carrer;

	@ManyToOne
	@JoinColumn(name = "id_entity", nullable = false)
	private Entities entity;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "opportunities_stays", joinColumns = @JoinColumn(name = "id_opportunity"), inverseJoinColumns = @JoinColumn(name = "id_stay"))
	private Set<Stays> stay;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "opportunities_participants", joinColumns = @JoinColumn(name = "id_opportunity"), inverseJoinColumns = @JoinColumn(name = "id_participant"))
	private Set<Participants> participant;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String imageUrl;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String hyperlink;

	public Long getIdOpportunity() {
		return idOpportunity;
	}

	public void setIdOpportunity(Long idOpportunity) {
		this.idOpportunity = idOpportunity;
	}

	public Carrer getCarrer() {
		return carrer;
	}

	public void setCarrer(Carrer carrer) {
		this.carrer = carrer;
	}

	public Entities getEntity() {
		return entity;
	}

	public void setEntity(Entities entity) {
		this.entity = entity;
	}

	public Set<Stays> getStay() {
		return stay;
	}

	public void setStay(Set<Stays> stay) {
		this.stay = stay;
	}

	public Set<Participants> getParticipant() {
		return participant;
	}

	public void setParticipant(Set<Participants> participant) {
		this.participant = participant;
	}

	public String getImageURL() {
		return imageUrl;
	}

	public void setImageURL(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getHyperlink() {
		return hyperlink;
	}

	public void setHyperlink(String hyperlink) {
		this.hyperlink = hyperlink;
	}

	private static final long serialVersionUID = 1L;

}
