package com.summary.summary.model.course;


import com.summary.summary.model.user.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "site_name")
    private String site_name;

    @Column(name = "data")
    private String data;

    @Column(name = "name_course")
    private String nameCourse;

    @Column(name = "descriptions")
    private String descriptions;

    @Column(name = "certificatePhoto")
    private String certificatePhoto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
