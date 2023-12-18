package com.isc.cse.promotion.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.isc.cse.promotion.models.entity.CarouselsLogin;
import com.isc.cse.promotion.projections.CarouselLoginProjection.DataImages;

import java.util.List;

public interface ICarouselLoginDao extends CrudRepository<CarouselsLogin, Long> {

	@Query("SELECT cl.title AS title, cl.description AS description, c.imageUrl AS imageUrl "
			+ "FROM CarouselsLogin cl, Carousels c "
			+ "WHERE cl.carousel.idCarousel = c.idCarousel AND c.owner = :owner")
	List<DataImages> getDataImages(@Param("owner") String owner);

}
