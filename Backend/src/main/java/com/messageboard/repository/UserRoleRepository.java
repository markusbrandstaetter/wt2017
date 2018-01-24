package com.messageboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.messageboard.entity.security.UserRole;

public interface UserRoleRepository extends MongoRepository<UserRole, String> {

}
