package com.summary.summary.model.user;


import com.summary.summary.model.course.Course;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "phone")
    private String phone;

    @Column(name = "Personal_qualities")
    private String personalQualities;

    @Column(name = "data_of_birth")
    private String data;

    @Column(name = "age")
    private int age;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "description", length = 254)
    private String description;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="user")
    private List<Site> sites;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="user")
    private List<Photo> photos;

    @OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="user")
    private List<Course> courses;


}
