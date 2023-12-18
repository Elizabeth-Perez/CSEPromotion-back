package com.isc.cse.promotion.projections;

public class UserProjection {

	public interface UserAccess {
		String getUser();

		String getPassword();

		String getSession();
	}
}
