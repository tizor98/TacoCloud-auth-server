package com.local.authserver.authserver.repository;

import com.local.authserver.authserver.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

   User findByUsername(String username);

}
