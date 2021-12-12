package com.example.bil7.alisveris.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(schema = "public",name="user_info")
@Setter
@Getter
public class User {
    @Id
    private long id;
    @Column(name = "user_name")
    private String userName;
    private String password;


}
