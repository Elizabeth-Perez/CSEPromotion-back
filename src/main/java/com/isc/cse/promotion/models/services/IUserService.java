package com.isc.cse.promotion.models.services;

import java.util.List;

import com.isc.cse.promotion.projections.UserProjection.UserAccess;

public interface IUserService {

	public List<UserAccess> getUserAccess();
}
