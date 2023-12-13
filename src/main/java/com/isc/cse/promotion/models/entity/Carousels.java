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
@Table(name = "carousel")
public class Carousels implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCarousel;
	
	@ManyToOne
    @JoinColumn(name = "study_program", nullable = false)
    private Carrer carrer;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String imageUrl;

	@Column(length = 20, nullable = false)
	private String owner;

	public Long getIdCarousel() {
		return idCarousel;
	}

	public void setIdCarousel(Long idCarousel) {
		this.idCarousel = idCarousel;
	}

    public Carrer getCarrer() {
        return carrer;
    }

    public void setCarrer(Carrer carrer) {
        this.carrer = carrer;
    }

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	private static final long serialVersionUID = 1L;

}
