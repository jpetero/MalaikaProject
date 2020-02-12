package com.julio.malaika2.repositories;

import com.julio.malaika2.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer> {
}
