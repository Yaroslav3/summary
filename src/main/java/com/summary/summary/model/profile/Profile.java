package com.summary.summary.model.profile;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "profile_id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;
}
