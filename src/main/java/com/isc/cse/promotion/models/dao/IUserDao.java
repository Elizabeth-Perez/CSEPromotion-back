package com.isc.cse.promotion.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.isc.cse.promotion.models.entity.Users;

public interface IUserDao extends CrudRepository<Users, String> {

}
