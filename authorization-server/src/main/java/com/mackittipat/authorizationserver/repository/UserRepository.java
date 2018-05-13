package com.mackittipat.authorizationserver.repository;

import com.mackittipat.authorizationserver.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

    UserModel findByUsername(String username);

}
