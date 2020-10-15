package com.blair.rentool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blair.rentool.models.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByEmail(String email);
}
