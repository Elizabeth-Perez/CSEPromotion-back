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
@Table(name = "carousel_login")
public class CarouselsLogin implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCarouselLogin;
	
	@ManyToOne
    @JoinColumn(name = "idCarousel", nullable = false)
    private Carousels carousel;

	@Column(length = 100, nullable = false)
	private String title;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String description;

	public Long getIdCarouselLogin() {
		return idCarouselLogin;
	}

	public void setIdCarouselLogin(Long idCarouselLogin) {
		this.idCarouselLogin = idCarouselLogin;
	}
	
    public Carousels getCarousel() {
        return carousel;
    }

    public void setCarousel(Carousels carousel) {
        this.carousel = carousel;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private static final long serialVersionUID = 1L;

}
