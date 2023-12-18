package com.isc.cse.promotion.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Users;
import com.isc.cse.promotion.projections.UserProjection.UserAccess;

public interface IUserDao extends CrudRepository<Users, String> {

	@Query("SELECT u.user AS user, u.password AS password, sc.session AS session "
			+ "FROM Users u, SystemConfiguration sc "
			+ "WHERE u.userEnrollment = sc.user.userEnrollment")
	List<UserAccess> getUserAccess();


}
