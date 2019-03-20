package io.github.isaackrementsov.springchat.repositories;

import org.springframework.data.repository.CrudRepository;
import io.github.isaackrementsov.springchat.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

}