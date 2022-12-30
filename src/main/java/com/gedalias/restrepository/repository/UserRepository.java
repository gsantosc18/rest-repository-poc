package com.gedalias.restrepository.repository;

import com.gedalias.restrepository.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface UserRepository extends MongoRepository<UserEntity, String> {
    @RestResource(path = "find_name")
    List<UserEntity> findByName(@Param("name") String name);
}
