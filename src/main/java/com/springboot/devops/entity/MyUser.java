package com.springboot.devops.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "MyUser")
public class MyUser {

    @Id
    private Long id;
    private String username;
    private String password;
    private String role; //Eg: ADMIN,USER

}
