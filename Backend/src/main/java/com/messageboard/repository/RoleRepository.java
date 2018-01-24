package com.messageboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.messageboard.entity.security.Role;


public interface RoleRepository extends MongoRepository<Role, String>{

}