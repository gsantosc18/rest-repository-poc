package com.gedalias.restrepository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user")
public class UserEntity {
    @Id
    private String id;
    private String name;
    private String email;
}
